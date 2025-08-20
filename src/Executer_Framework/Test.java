package Executer_Framework;


import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 42;
        });

        Integer i;
        try {
            i = future.get(1,TimeUnit.SECONDS);
            System.out.println(future.isDone());
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Exception occurred: "+e);
        }
    }
}
