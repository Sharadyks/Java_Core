package Multithreading.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockfairness {
    Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" aquired the lock");
            Thread.sleep(500);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName()+" released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Lockfairness first = new Lockfairness();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                first.accessResource();
            }
        };
        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task,"Thread-2");
        Thread t3 = new Thread(task,"Thread-3");

        t1.start();

        t2.start();
        t3.start();
    }
}
