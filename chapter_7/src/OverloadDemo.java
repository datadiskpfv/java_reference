/**
 * Created by vallep on 4/16/2017.
 *
 */

class Overload {
    void test() {
        System.out.println("No parameters");
    }

    // overload for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    // overload for two integer parameters
    void test(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
    }

    // overload for double parameter, also java will promote integers if a method cannot be found
    void test(double c) {
        System.out.println("c: " + c);
    }
}
public class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();

        ob.test();
        ob.test(5);
        ob.test(5, 10);
        ob.test(12.34);
    }
}
