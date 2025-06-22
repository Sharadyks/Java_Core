package Challenges;

import java.util.Scanner;

public class MinBytTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to minimum number finder!");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();

        int minNumber = num1 > num2 ? num2 : num1 ;
        System.out.println("The minimum number is " + minNumber);
    }
}
