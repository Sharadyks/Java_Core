package Challenges.Abstraction_Interface;

public class Square extends Shape{
    private final double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void greetMe() {
        System.out.println("Welcome to get area of square");
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
