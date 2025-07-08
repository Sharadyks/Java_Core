package Multithreading;

public class Daemon extends Thread{
    @Override
    public void run() {
//        while (true){
//            System.out.println("My name is Sharad Sharma");
//        }
    }

    public static void main(String[] args) {
        Daemon myThread = new Daemon();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("Hello World!");
    }
}
