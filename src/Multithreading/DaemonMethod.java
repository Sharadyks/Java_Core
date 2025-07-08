package Multithreading;

public class DaemonMethod extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("My name is Sharad Sharma");
        }
    }

    public static void main(String[] args) {
        DaemonMethod myThread = new DaemonMethod();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("Hello World!");
    }
}
