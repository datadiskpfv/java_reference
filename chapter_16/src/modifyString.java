/**
 * Created by vallep on 5/21/2017.
 */
public class modifyString {
    public static void main(String[] args) {
        String s1 = "All good things come to those who wait";
        int start_position = 9;

        // start position
        System.out.println("substring pos(30): " + s1.substring(30));
        System.out.println("substring pos(" + start_position + "): " + s1.substring(start_position));
        System.out.println();

        String s2 = "two ";
        String s3 = "three";
        String r1 = s2.concat(s3);

        System.out.println("concat of s2 and s3: " + r1);

        String s4 = "Hello";
        String s5 = s4.replace('l', 'w');                   // notice single quotes
        String s6 = s4.replace("Hello", "World");           // notice double quotes
        System.out.println("Replace l with w: " + s5);
        System.out.println("Replace Hello with World: " + s6);

        String s7 = "       Hello World     ";
        System.out.println("trim white space: " + s7.trim() + " :");
        System.out.println();

        char[] c = {'P', 'A', 'U', 'L'};
        int i = 10;
        double d = 19.9;
        float f = 0.06F;

        System.out.println("char: " + String.valueOf(c));
        System.out.println("int: " + String.valueOf(i));
        System.out.println("double: " + String.valueOf(d));
        System.out.println("float: " + String.valueOf(f));
        System.out.println();

        String s8 = "Hello";
        String s9 = "HELLO";

        System.out.println("toUpperCase: " + s8.toUpperCase());
        System.out.println("toLowerCase: " + s9.toLowerCase());
        System.out.println();

        String s10 = "Have";
        String s11 = "a";
        String s12 = "nice";
        String s13 = "day";

        System.out.println(String.join(" ", s10, s11, s12, s13 ));
        System.out.println();

        String s14 = "Have a nice day";
        System.out.println("nice is in s14: " + s14.contains("nice"));
        System.out.println("night is in s14: " + s14.contains("night"));
        System.out.println();

        String s15 = "";
        String s16 = "Hello";
        System.out.println("isEmpty: " + s15.isEmpty());
        System.out.println("isEmpty: " + s16.isEmpty());
    }
}