/**
 * Created by vallep on 20/06/2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWngs();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}