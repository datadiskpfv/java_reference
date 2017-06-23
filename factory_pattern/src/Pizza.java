import java.util.ArrayList;

/**
 * Created by vallep on 22/06/2017.
 */
public abstract class Pizza {
    String name;
    Dough dough;
//    Sauce sauce;
//    Veggies veggies[];
//    Cheese cheese;
//    Pepperoni pepperoni;
//    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 20 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString () {
        // code to print pizza here
        return "toString";
    }
}
