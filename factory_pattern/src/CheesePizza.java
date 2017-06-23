/**
 * Created by vallep on 23/06/2017.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        System.out.println("Dough " + dough.getDough());

        //sauce = ingredientFactory.createSauce();
        //cheese = ingredientFactory.createCheese();
    }
}
