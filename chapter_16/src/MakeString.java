/**
 * Created by vallep on 5/21/2017.
 */
public class MakeString {
    public static void main(String[] args) {

        char[] c = {'P', 'A', 'U', 'L'};
        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("String length: " + s1.length());

        byte[] ascii = {65, 66, 67, 68, 69, 70};

        String s3 = new String(ascii);
        System.out.println(s3);

        // starting position, how many chars
        String s4 = new String(ascii, 2, 3);
        System.out.println(s4);

        // non-strings will get convert to a string, it uses the valueOf overload method
        // which calls toString
        int age = 49;
        String name = "Paul";
        System.out.println("Name: " + name + ", Age: " + age + ", " + (100 - age) + " years to go to one hundred");
    }
}
