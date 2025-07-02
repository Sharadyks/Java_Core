package Challenges.Abstraction_Interface;

public abstract class Bird implements Flyable{
    private final String breed;
    public Bird(String breed){
        this.breed = breed;
    }

}
