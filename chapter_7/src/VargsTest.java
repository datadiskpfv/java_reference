/**
 * Created by vallep on 4/17/2017.
 */

public class VargsTest {

    static void vaTest(int ... v){
        System.out.println("Number of args: " + v.length + " Contents: ");

        for(int x : v)
            System.out.println( x + " ");

        System.out.println();
    }

    static void vaTest(String ... v){
        System.out.println("Number of args: " + v.length + " Contents: ");

        for(String x : v)
            System.out.println( x + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(10);
        vaTest(1, 2, 3);
        // vaTest(); will cause compile errors as either of above will work
        vaTest("hello");
    }
}
