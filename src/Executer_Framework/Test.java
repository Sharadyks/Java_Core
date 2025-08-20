package Executer_Framework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(9);

        Callable<Integer> callable1 = ()->{
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = ()->{
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = ()->{
            System.out.println("Task 3");
            return 3;
        };
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        List<Future<Integer>> future = executorService.invokeAll(list);
        future.get(callable1);
        executorService.shutdown();
    }
}
