package cocurrent;

public class Account {
    private int balance;
    private Allocator allocator;

    void transfer(Account target, int amt) {

        allocator.apply(this, target);
        try {
            synchronized (this) {
                synchronized (target) {
                    if (this.balance > amt) {
                        this.balance -= amt;
                        target.balance += amt;
                    }
                }
            }
        } finally {
            allocator.free(this, target);
        }
    }

}