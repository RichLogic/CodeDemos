package cocurrent;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Allocator {
    private List<Object> list = new LinkedList<>();

    synchronized void apply(Object from, Object to) {
//        if (list.contains(from) || list.contains(to)) {
//            return false;
//        } else {
//            list.add(from);
//            list.add(to);
//            return true;
//        }

        Lock lock = new ReentrantLock();
        Queue queue = new PriorityQueue();

        while (list.contains(from) || list.contains(to)) {
            try {
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        list.add(from);
        list.add(to);
    }

    synchronized void free(Object from, Object to) {
        list.remove(from);
        list.remove(to);
        this.notifyAll();
    }
}
