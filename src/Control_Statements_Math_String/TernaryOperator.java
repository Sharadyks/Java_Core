package Control_Statements_Math_String;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();
//        int greaterNumber;
//        if (num1>num2){
//            greaterNumber = num1;
//        } else {
//            greaterNumber = num2;
//        }
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is greater number");
    }
}
