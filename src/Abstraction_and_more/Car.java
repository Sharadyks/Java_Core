package Abstraction_and_more;

public class Car extends Vehicle {

    int noOfDoors;
    public Car() {
        super(4);

    }

    @Override
    public void makeStartSound() {
        System.out.println("bruhhmm...");
    }

}
