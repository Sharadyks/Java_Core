package Multithreading.Synchronization;

public class HelloThread extends Thread {
    Counter counter;
    public HelloThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i = 0; i<1000; i++ ){
            counter.increment();
        }

    }
}
