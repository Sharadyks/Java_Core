package Challenges.Abstraction_Interface;

public class Testsquare {
    public static void main(String[] args) {
        Square square = new Square(5.3654);
        square.greetMe();
        square.getSide();
        System.out.println(square.calculateArea());
    }
}
