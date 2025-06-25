package Challenges.OOP.Access_modifier.Utils;

import Challenges.OOP.Access_modifier.Geometry.Circle;
import Challenges.OOP.Access_modifier.Geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.23);
        double circArea = Math.PI * Math.pow(c1.radius,2);
        System.out.println("Area of circle is " + circArea);

        Rectangle r1 = new Rectangle(3.1,6.5);
        double rectArea = (r1.length) * (r1.breadth);
        System.out.println("The area of rectangle is " + rectArea);

    }

}
