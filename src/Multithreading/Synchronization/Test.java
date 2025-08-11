package Multithreading.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        HelloThread t1 = new HelloThread(counter);
        HelloThread t2 = new HelloThread(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
//            System.out.printf("%d %d",counter.getCount(),counter.getHello());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
        System.out.println(counter.getHello());

    }
}
