package Abstraction_and_Polyphormism;

public interface Transport {
     void getSetGo();
default void hello(){
     System.out.println("Hello");
}
}
