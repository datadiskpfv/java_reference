import javax.print.attribute.IntegerSyntax;

/**
 * Created by vallep on 4/15/2017.
 */
public class NumTest {
    public static void main(String args[]) {

        System.out.println("Byte Size: " + Byte.SIZE);
        System.out.println("Short Size: " + Short.SIZE);
        System.out.println("Integer Size: " + Integer.SIZE);
        System.out.println("Float Size: " + Float.SIZE);
        System.out.println("Long Size: " + Long.SIZE);
        System.out.println("Double Size: " + Double.SIZE);
        System.out.println();

        // Hex
        int h1 = 0xf;
        System.out.println("h1: " + h1 + Double.SIZE);

        // exponent
        double f1 = 0.0002E5;
        System.out.println("f1: " + f1);

        // underscores
        int u1 = 123_456_789;
        System.out.println("u1: " + u1);

        // binary
        int b1 = 0b1010;
        System.out.println("b1: " + b1);

        // binary exponent
        double be1 = 0x12.2P2;
        System.out.println("be1: " + be1);
    }
}