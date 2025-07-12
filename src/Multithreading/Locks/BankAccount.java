package Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is preparing withdrwal");
        try {
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                if (amount<=balance){
                try {
                        System.out.println(Thread.currentThread().getName()+ " is preceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+" withdrawal is done. Remaining balance is "+balance);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
                } else {
                    System.out.println("Balance is not sufficient to withdraw the amount");
                }

            } else {
                System.out.println(Thread.currentThread().getName()+" could not aquire the lock");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
