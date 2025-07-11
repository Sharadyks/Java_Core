package Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance>=amount){
                    System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                throw new RuntimeException(e);
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining balance is: "+ balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + "Insufficient balance");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
