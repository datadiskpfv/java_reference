/**
 * Created by vallep on 4/15/2017.
 *
 */
public class Scope {
    public static void main(String args[]) {
        int x;

        x = 10;
        if(x == 10) {
            int y = 20;

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100;  // ERROR y not known here

        // x is still known here
        System.out.println("x is " + x);
    }
}