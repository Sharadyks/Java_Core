package Multithreading;

public class MyThread2 extends Thread {

    @Override
    public void run() {
//        for (int i = 1; i<5; i++){
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if (i==1){
//                System.out.println("Sharad Sharma");
//            } else if (i==2) {
//                System.out.println("Yuvraj");
//            } else if (i==3) {
//                System.out.println("Aman Sharma");
//            } else if (i==4) {
//                System.out.println("Rohit");
//            }
//        }
        for (int i =1; i<2; i++ ){
            names();
        }

    }

    public static void names(){
        for (int i = 1; i<5; i++){
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i==1){
                System.out.println("Sharad Sharma");
            } else if (i==2) {
                System.out.println("Yuvraj");
            } else if (i==3) {
                System.out.println("Aman Sharma");
            } else {
                System.out.println("Rohit");
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t1.join();
        t2.start();
    }

}
