package Multithreading.Locks;

public class Test {
    public static void main(String[] args) {
        BankAccount IOB = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                IOB.withdraw(50);
            }
        };
        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }
}
