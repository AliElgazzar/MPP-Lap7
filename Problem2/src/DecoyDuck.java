public class DecoyDuck extends Duck implements FlyBehavior, QuackBehavior{

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck");
    }


}