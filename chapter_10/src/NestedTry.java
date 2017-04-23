/**
 * Created by vallep on 4/23/2017.
 */
public class NestedTry {
    public static void main(String args[]) {
        try {
            int a = args.length;

            int b = 42 / a;

            System.out.println("a = " + a);

            try {
                if(a==1) a = a/(a-a);

                if(a==2) {
                    int c[] = { 1 };
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of bounds " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero " + e);
        }
        System.out.println("Program continues");
    }
}
