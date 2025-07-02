package Challenges.Abstraction_Interface;

import java.util.Scanner;

public class Circle extends Shape{
//     FOR PRE-DEFINED RADIUS
//    private double radius = 1.023;
//
//    @Override
//    public void greetMe() {
//        System.out.println("Welcome to get area of Circle");
//    }
//
//    @Override
//    public void calculateArea() {
//        double circArea = Math.PI * Math.pow(2,radius);
//        System.out.printf("Area of circle is %f",circArea);
//    }

// AND NOW FOR USER INPUT RADIUS
    private static double radius;

    @Override
    public void greetMe() {
        System.out.println("Welcome to get area of circle");
    }

    @Override
    public double calculateArea() {
        double circArea = Math.PI * Math.pow(radius,2);
        return circArea;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle();
        circle1.greetMe();
        System.out.println("Enter the radius of circle: ");
        radius = input.nextDouble();

        System.out.println(circle1.calculateArea());

    }


}
