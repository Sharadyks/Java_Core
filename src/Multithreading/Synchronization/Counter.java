package Multithreading.Synchronization;

 public class Counter {
    private int count = 0;
    private int hello = 0;
    public void increment(){
        synchronized (this){
            count++;
        }
        hello++;
    }
    public int getCount(){
        return count;
    }

     public int getHello() {
         return hello;
     }
 }
