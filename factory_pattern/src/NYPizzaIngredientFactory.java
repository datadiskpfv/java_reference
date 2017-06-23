/**
 * Created by vallep on 23/06/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    //@Override
    //public Sauce createSauce() {
     //   return MarinaraSauce();
    //}

    //@Override
    //public Cheese createCheese() {
     //   return ReggianoCheese();
    //}

//    @Override
//    public Veggies[] createVeggies() {
//        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
//        return veggies;
//    }
//
//    @Override
//    public Pepperoni createPepperoni() {
//        return new SlicedPepperoni();
//    }
//
//    @Override
//    public Clams createClam() {
//        return new FreshClams();
//    }
}
