/**
 * Created by vallep on 4/16/2017.
 */
public class BitLogic {
    public static void main(String args[]) {
        int binary[] = { 0b0000, 0b0001, 0b0011, 0b0111, 0b1111 };

        System.out.println("0000: " + Integer.toBinaryString(binary[0]) + " " + binary[0]);
        System.out.println("0001: " + Integer.toBinaryString(binary[1]) + " " + binary[1]);
        System.out.println("0011: " + Integer.toBinaryString(binary[2]) + " " + binary[2]);
        System.out.println("0111: " + Integer.toBinaryString(binary[3]) + " " + binary[3]);
        System.out.println("1111: " + Integer.toBinaryString(binary[4]) + " " + binary[4]);

        System.out.println("0000: " + Integer.toBinaryString(~binary[0]) + " " + ~binary[0]);
        System.out.println("0001: " + Integer.toBinaryString(~binary[1]) + " " + ~binary[1]);
        System.out.println("0011: " + Integer.toBinaryString(~binary[2]) + " " + ~binary[2]);
        System.out.println("0111: " + Integer.toBinaryString(~binary[3]) + " " + ~binary[3]);
        System.out.println("1111: " + Integer.toBinaryString(~binary[4]) + " " + ~binary[4]);

        int br1 = binary[0] & binary[1];
        int br2 = binary[1] & binary[2];

        System.out.println("0000 + 0001 = " + Integer.toBinaryString(br1) + " \t" + br1);
        System.out.println("0001 + 0011 = " + Integer.toBinaryString(br2) + " \t" + br2);

        int br3 = binary[0] | binary[1];
        int br4 = binary[1] | binary[2];

        System.out.println("0000 | 0001 = " + Integer.toBinaryString(br3) + " \t" + br3);
        System.out.println("0001 | 0011 = " + Integer.toBinaryString(br4) + " \t" + br4);

        int br5 = binary[0] ^ binary[1];
        int br6 = binary[1] ^ binary[2];

        System.out.println("0000 ^ 0001 = " + Integer.toBinaryString(br5) + " \t" + br5);
        System.out.println("0001 ^ 0011 = " + Integer.toBinaryString(br6) + " \t" + br6);

        int br7 = binary[1] << 2;
        int br8 = binary[1] << 3;
        int br9 = binary[1] << 20;

        System.out.println("0001 << 2 = " + Integer.toBinaryString(br7) + " \t" + br7);
        System.out.println("0001 << 3 = " + Integer.toBinaryString(br8) + " \t" + br8);
        System.out.println("0001 << 20 = " + Integer.toBinaryString(br8) + " \t" + br9);

        int br10 = binary[1] >> 2;
        int br11 = binary[1] >> 20;
        int br12 = -16 >> 2;

        System.out.println("0001 >> 2 = " + Integer.toBinaryString(br10) + " \t" + br10);
        System.out.println("0001 >> 3 = " + Integer.toBinaryString(br11) + " \t" + br11);
        System.out.println("0001 >> 20 = " + Integer.toBinaryString(br12) + " \t" + br12);

        int br13 = -10 >>> 2;
        int br14 = -255 >>> 20;
        int br15 = -1024 >>> 8;

        System.out.println("-10 >>> 2 = " + Integer.toBinaryString(-10) + " "
                                          + Integer.toBinaryString(br13)
                                          + " \t" + br13);

        System.out.println("-255 >>> 20 = " + Integer.toBinaryString(-255) + " "
                                            + Integer.toBinaryString(br14)
                                            + " \t" + br14);

        System.out.println("-1024 >>> 8 = " + Integer.toBinaryString(br15) + " \t" + br15);
    }
}