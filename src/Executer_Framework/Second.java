package Executer_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Second {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            Future<?> future = executor.submit(() -> {
                long result = fact(finalI);
                System.out.println(result);
            });

        }
//        for (Thread thread : threads) {
//            try {
//                thread.join();
//            } catch (Exception e) {
//                Thread.currentThread().interrupt();
//
//            }
//        }
        executor.shutdown();
        try {
            while (!executor.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                System.out.println("Waiting...");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total Time: " + (System.currentTimeMillis() - startTime));

    }

    public static long fact(int n) {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
