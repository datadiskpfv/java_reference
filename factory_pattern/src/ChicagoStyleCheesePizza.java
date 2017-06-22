/**
 * Created by vallep on 22/06/2017.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Sliced Button Mushrooms");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}