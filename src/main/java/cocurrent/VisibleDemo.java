package cocurrent;

public class VisibleDemo {

    private static long count = 0;

    synchronized private void add() {
        int index = 0;
        while (index++ < 10000)
            count ++;
    }

    public static void main(String[] args) throws InterruptedException {

        VisibleDemo test = new VisibleDemo();

        Thread th1 = new Thread(test::add);
        Thread th2 = new Thread(test::add);
        th1.start();
        th2.start();

        // 等待两个线程执行结束
        th1.join();
        th2.join();

        System.out.println(count);
    }

}