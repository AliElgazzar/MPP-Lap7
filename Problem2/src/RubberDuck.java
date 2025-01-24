public class RubberDuck extends Duck implements FlyBehavior, QuackBehavior {

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
