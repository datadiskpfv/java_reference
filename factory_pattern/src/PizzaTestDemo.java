/**
 * Created by vallep on 22/06/2017.
 */
public class PizzaTestDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore = new ChicagoPizzaStore();

        Pizza NYpizza = nyStore.orderPizza("cheese");
        System.out.println("Paul ordered a " + NYpizza.getName() + "\n");

        Pizza CHICpizza = chStore.orderPizza("chicago");
        System.out.println("Lorraine ordered a " + CHICpizza.getName() + "\n");

    }
}
