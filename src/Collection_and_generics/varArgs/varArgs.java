package Collection_and_generics.varArgs;

public class varArgs {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(sum(4,5));
//        System.out.println(sum(new int[]{4,5,6,7,8,9,4,5,6,1,2,3,3,2,1,4,5,6,9,8,7}));
        System.out.println(sum(4,5,7,8,3,2,74));

    }

    public static int sum (int... a){
        int c = 0;
        for (int i : a) {
            c += i;
        }
        return c;
    }

//    public static int sum(int[] a){
//
//    }

    public static int sum(int a , int b){
        return a+b;
    }


}
