package cocurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockedQueue<T> {
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();
    Boolean isFull;
    Boolean isEmpty;

    void enq(T t) throws InterruptedException {
        lock.lock();
        try {
            while (isFull) {
                notFull.await();
            }
            // 入队操作
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    void deq() throws InterruptedException {
        lock.lock();
        try {
            while (isEmpty) {
                notEmpty.await();
            }
            // 出队操作
            notFull.signal();
        } finally {
            lock.unlock();
        }
    }
}
