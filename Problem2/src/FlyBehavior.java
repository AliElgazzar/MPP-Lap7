import java.sql.SQLOutput;

public interface FlyBehavior {
    default void fly(){
        System.out.println("I can fly");
    }

}
