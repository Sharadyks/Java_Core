package Challenges.Abstraction_Interface;

public class Square extends Shape{
    private double side = 5.36;

    @Override
    public void greetMe() {
        System.out.println("Welcome to get area of square");
    }

    @Override
    public double calculateArea() {
        double circSquare = Math.pow(side,2);
        return circSquare;
    }

    public static void main(String[] args) {
        Square square1 = new Square();
        square1.greetMe();
        System.out.println(square1.calculateArea());
    }
}
