/**
 * Created by vallep on 4/23/2017.
 */
public class Exc2 {
    public static void main(String args[]) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero, exception error: " + e);
            a = 0;
        }
        System.out.println("After catch statement, a equals: " + a);
    }
}
