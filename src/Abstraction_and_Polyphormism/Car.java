package Abstraction_and_Polyphormism;

public class Car extends Vehicle {


    int noOfDoors;
    public Car() {
        super(4);

    }

    @Override
    public void makeStartSound() {
        System.out.println("bruhhmm...");
    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
