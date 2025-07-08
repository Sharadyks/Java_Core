package Multithreading;

public class Yield extends Thread {
    public Yield(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+ " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) throws Exception {
        Yield t1 = new Yield("t1");
        Yield t2 = new Yield("t2");
        t1.start();
        t2.start();
    }

//    DAEMON THREAD:- These threads run in the background. JVM won't wait for these threads to finish
}
