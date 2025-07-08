package Multithreading;

public class Priority extends Thread {
    public Priority(String name){
        super(name);
    }
    public void run(){

       for (int i = 1; i<5; i++) {
           System.out.println(Thread.currentThread().getName()+ " Priority : "+ Thread.currentThread().getPriority()+" count : "+i);
       }


    }
    public static void main(String[] args) throws InterruptedException {
        Priority t1 = new Priority("Sharad");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}

