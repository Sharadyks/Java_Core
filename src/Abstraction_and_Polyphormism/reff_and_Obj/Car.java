package Abstraction_and_Polyphormism.reff_and_Obj;

public class Car implements Vehicle{
    public int noOfDoors(){
        return 4;
    }

    @Override
    public void start() {
        System.out.println("Car is going");
    }
}
