/**
 * Created by vallep on 4/17/2017.
 *
 */
public class StringDemo {
    public static void main(String args[]) {

        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = "Third String";
        String strDummy = strOb2;

        System.out.println(strOb1 + " is " + strOb1.length());
        System.out.println(strOb2 + " is " + strOb2.length());
        System.out.println(strOb3 + " is " + strOb3.length());

        strOb1 = "Hello World";
        System.out.println("strOb1 3 character: " + strOb1.charAt(3));
        System.out.println("strOb1 6 character: " + strOb1.charAt(6));
        System.out.println("strOb1 9 character: " + strOb1.charAt(9));

        if (strOb2.equals(strDummy)) System.out.println("strOb2 is equal to strDummy");

    }
}