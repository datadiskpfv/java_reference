import java.text.DecimalFormat;

/**
 * Created by vallep on 22/06/2017.
 */
public class StarBucksDemo {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription()
                + " £" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);
        beverage1 = new Whip(beverage1);

        DecimalFormat dec = new DecimalFormat("#0.00");

        System.out.println(beverage1.getDescription()
                + " £" + dec.format(beverage1.cost()));
    }
}
