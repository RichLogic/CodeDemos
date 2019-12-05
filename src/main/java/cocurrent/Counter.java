package cocurrent;

public class Counter {
    private long value;

    synchronized public long getValue() {
        return value;
    }

    synchronized public long addOne() {
        return ++ value;
    }
}
