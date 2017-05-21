/**
 * Created by vallep on 5/21/2017.
 */
public class compareStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        String s5 = new String(s1);
        String s6 = "Igloo";

        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + " equals " + s5 + " -> " + s1.equals(s5));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));
        System.out.println();

        // == checks if object references are equal
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
        System.out.println(s1 + " == " + s3 + " -> " + (s1 == s3));
        System.out.println(s1 + " == " + s5 + " -> " + (s1 == s5));
        System.out.println();

        System.out.println("Foobar starts with Foo: " + "Foobar".startsWith("Foo"));
        System.out.println("Foobar ends with bar: " + "Foobar".endsWith("bar"));
        System.out.println();

        System.out.println(s1 + " comparesTo " + s2 + " -> " + (s1.compareTo(s2)));
        System.out.println(s1 + " comparesTo " + s3 + " -> " + (s1.compareTo(s3)));
        System.out.println(s1 + " comparesTo " + s6 + " -> " + (s1.compareTo(s6)));
        System.out.println();
    }
}
