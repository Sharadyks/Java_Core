package Multithreading;

public class Prioritymethod extends Thread {
    public Prioritymethod(String name){
        super(name);
    }
    public void run(){

       for (int i = 1; i<5; i++) {
           System.out.println(Thread.currentThread().getName()+ " Priority : "+ Thread.currentThread().getPriority()+" count : "+i);
       }


    }
    public static void main(String[] args) throws InterruptedException {
        Prioritymethod t1 = new Prioritymethod("Sharad");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}

