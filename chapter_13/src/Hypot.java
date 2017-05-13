/**
 * Created by vallep on 5/13/2017.
 *
 */

// allows us to not have to specify the Math class later in the program
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        // notice that we did not have to specify the Math class with pow and sqrt
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("the hypotenuse: " + hypot);
    }
}