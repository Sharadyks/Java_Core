package Executer_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        ExecutorService executorService = Executors.newFixedThreadPool(9);
        Thread[] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            threads[i - 1] = new Thread(
                    () -> {
                        long result = fact(finalI);
                        System.out.println(result);
                    }
            );
            threads[i - 1].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                Thread.currentThread().interrupt();

            }
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
