//package cocurrent;
//
//import java.util.concurrent.*;
//
//public class ThreadPoolDemo {
//
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//        final ThreadPoolExecutor threadPool = new ThreadPoolExecutor(20, 100, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(10000));
//
//        Future<Double> future1 = threadPool.submit(new callTask());
//        Future<Double> future2 = threadPool.submit(new callTask());
//        Future<Double> future3 = threadPool.submit(new callTask());
//        Future<Double> future4 = threadPool.submit(new callTask());
//
////        threadPool.shutdown();
//        System.out.println(future1.get() + future2.get() + future3.get() + future4.get());
//
//        FutureTask<Double> futureTask = new FutureTask<>(() -> Math.random() * 10);
//        threadPool.submit(futureTask);
//        System.out.println(futureTask.get());
//
//        Executor executor = Executors.newFixedThreadPool(2);
//        while(存在未对账订单){
//            // 计数器初始化为 2
//            CountDownLatch latch = new CountDownLatch(2);
//            // 查询未对账订单
//            executor.execute(() -> {
//                pos = getPOrders();
//                latch.countDown();
//            });
//            // 查询派送单
//            executor.execute(() -> {
//                dos = getDOrders();
//                latch.countDown();
//            });
//
//            // 等待两个查询操作结束
//            latch.await();
//        }
//
//
//        // 订单队列
//        Vector<P> pos;
//        // 派送单队列
//        Vector<D> dos;
//        // 执行回调的线程池
//        Executor executor = Executors.newFixedThreadPool(1);
//        final CyclicBarrier barrier = new CyclicBarrier(2, () -> executor.execute(this::check));
//
//        void check(){
//            P p = pos.remove(0);
//            D d = dos.remove(0);
//            // 执行对账操作
//            diff = check(p, d);
//            // 差异写入差异库
//            save(diff);
//        }
//
//        void checkAll(){
//            // 循环查询订单库
//            Thread T1 = new Thread(()->{
//                while(存在未对账订单){
//                    // 查询订单库
//                    pos.add(getPOrders());
//                    // 等待
//                    barrier.await();
//                }
//            });
//            T1.start();
//            // 循环查询运单库
//            Thread T2 = new Thread(()->{
//                while(存在未对账订单){
//                    // 查询运单库
//                    dos.add(getDOrders());
//                    // 等待
//                    barrier.await();
//                }
//            });
//            T2.start();
//        }
//
//
//    }
//
//    private static class callTask implements Callable {
//
//        @Override
//        public Double call() {
//            return Math.random() * 10;
//        }
//
//    }
//
//}
