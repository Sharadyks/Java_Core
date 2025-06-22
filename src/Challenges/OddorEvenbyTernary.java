package Challenges;

import java.util.Scanner;

public class OddorEvenbyTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd or Even finder!");
        System.out.print("Please enter the number: ");
        double num = input.nextDouble();

        String numResult = (num%2)==0 ? "Even" : "Odd";
        System.out.println("Your number is "+ (numResult));
    }
}
