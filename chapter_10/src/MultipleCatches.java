/**
 * Created by vallep on 4/23/2017.
 */
public class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        //} catch (Exception e) {
        //    System.out.println("should not put exception superclass above subclass");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds " + e);
        }
        System.out.println("After try/catch blocks.");
    }
}
