package Abstraction_and_Polyphormism.reff_and_Obj;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
//        Vehicle v = new Vehicle();
        Plane p = new Plane();
//        castTest(v);
        castTest(c);
        castTest(p);

//        Vehicle vCar = new Car();


    }

    private static void castTest(Vehicle veh){
//        Car cVehicle = (Car) veh;
//        ((Car) veh).noOfDoors();
        veh.start();
//        cVehicle.noOfDoors();

        if (veh instanceof Car){

        }
    }
}
