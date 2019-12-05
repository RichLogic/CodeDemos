package cocurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture future1 = CompletableFuture.runAsync(() -> {
            System.out.println("T1: 洗水壶...");
            sleep(1, TimeUnit.SECONDS);

            System.out.println("T1: 烧开水...");
            sleep(15, TimeUnit.SECONDS);
        });

        CompletableFuture future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("T2: 洗茶壶...");
            sleep(1, TimeUnit.SECONDS);

            System.out.println("T2: 洗茶杯...");
            sleep(2, TimeUnit.SECONDS);

            System.out.println("T2: 拿茶叶...");
            sleep(1, TimeUnit.SECONDS);
            return " 龙井 ";
        });

        CompletableFuture future3 = future1.thenCombine(future2, (result1, result2) -> {
            System.out.println("T2: 拿到茶叶:" + result2);
            System.out.println("T3: 泡茶...");
            return "上茶:" + result2;
        });

        System.out.println(future3.join());
    }

    private static void sleep(int i, TimeUnit seconds) {
        try {
            Thread.sleep(seconds.toMillis(i));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
