/**
 * Created by vallep on 4/14/2017.
 *
 */
public class BoolTest {
    public static void main(String args[]) {
        boolean b;

        b = false;
        //noinspection ConstantConditions
        System.out.println("b is " + b);

        b = true;
        //noinspection ConstantConditions
        System.out.println("b is " + b);
        //noinspection ConstantConditions
        if(b) System.out.println("This is executed");

        b = false;
        //noinspection ConstantConditions
        if (b) System.out.println("This is not executed");

        System.out.println("10 > 9 is " + ( 10 > 9 ));
    }
}
