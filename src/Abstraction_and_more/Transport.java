package Abstraction_and_more;

public interface Transport {
     void getSetGo();
default void hello(){
     System.out.println("Hello");
}
}
