/**
 * Created by vallep on 4/23/2017.
 *
 */

public class ThrowableTest {

    private static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
