/**
 * Created by vallep on 4/15/2017.
 *
 */
public class Conversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion of int to byte");
        b = (byte) i;
        System.out.println("i: " + i + " b: " + b);

        System.out.println("Conversion of double to int");
        i = (int) d;
        System.out.println("d: " + d + " i: " + i);

        // remove the decimal and modulo (%) of 256, which is 67
        System.out.println("Conversion of double to byte");
        b = (byte) d;
        System.out.println("d: " + d + " b: " + b);

        // java will automatically promote each byte to an int
        byte z = 40;
        byte y = 50;
        byte x = 100;

        int v = z * y / x;
        System.out.println("v: " + v);

        byte u = 50;
        // must be careful as below will cause an error because java promotes to int and then
        // tries assign back to an byte
          // u = u * 2;   // have to use the below to correct
        u =(byte) (u * 2);
        System.out.println("u: " + u);

        // byte, short and char are all promoted to int
        // if one expression is long then all promoted to long
        // if one expression is float then all promoted to float
        // if one expression is double then all promoted to double

    }
}