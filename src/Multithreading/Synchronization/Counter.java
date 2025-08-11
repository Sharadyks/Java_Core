package Multithreading.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;
    private int hello = 0;
    Lock lock = new ReentrantLock();
    public void increment(){
        lock.lock();
            count++;
        hello++;
    }

    public int getCount(){
        return count;
    }

     public int getHello() {
         return hello;
     }
 }
