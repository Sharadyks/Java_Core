package Control_Statements_Math_String;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        while (age<0 || age>100){
//            System.out.println("Please enter your age: ");
//            age = input.nextInt();
//
//        }
//        System.out.println("Your age is " + age);

        int age;
        do {
            System.out.println("Please enter your age: ");
             age = input.nextInt();
        } while (age<0 || age>100);
//            System.out.println("Please enter your age: ");
//            age = input.nextInt();
        System.out.println("Your age is :" + age);


    }
}
