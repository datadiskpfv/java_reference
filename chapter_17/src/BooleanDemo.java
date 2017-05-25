/**
 * Created by vallep on 5/25/2017.
 *
 */
public class BooleanDemo {
    public static void main(String[] args) {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean(Integer.toString(1));

        if (b1)
            System.out.println("b1 is true " + b1);

        if (b2)
            System.out.println("b2 is true " + b2);

        if (b3)
            System.out.println("b3 is true " + b3);
    }
}
