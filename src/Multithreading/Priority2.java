package Multithreading;

public class Priority2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+ " says hii");

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+ " says also hii");
            }
        });
        one.setPriority(Thread.MAX_PRIORITY);
        one.start();
    }
}
