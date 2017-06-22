/**
 * Created by vallep on 22/06/2017.
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }

//        } else if (type.equals("clam")) {
//            pizza = new ClamPizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
         else return null;
    }
}
