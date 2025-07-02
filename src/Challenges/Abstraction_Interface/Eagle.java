package Challenges.Abstraction_Interface;

public class Eagle extends Bird{
   public Eagle(){
        super("African fish eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying!!!");
    }
}
