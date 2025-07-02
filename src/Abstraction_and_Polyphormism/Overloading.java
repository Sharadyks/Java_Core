package Abstraction_and_Polyphormism;

public class Overloading {
//    public int sum(int a, int b){
//        return a+b;
//    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public String sum(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading();
        int sum = overload.sum(5,9,9);
        System.out.println(overload.sum("Hello","Sharad"));
    }
}
