package Challenges;

import java.util.Scanner;

public class ArithExcepHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();


        try {
            int result = a/b;
            System.out.printf("Your answer is %d",result);
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Denominator cannot be zero");
            } else {
                throw e;
            }
        }
    }
}
