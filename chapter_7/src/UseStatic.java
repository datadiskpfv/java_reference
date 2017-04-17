/**
 * Created by vallep on 4/17/2017.
 *
 */

class StaticDemo {
    static int a = 50;
    static int b = 75;

    static void callme() {
        System.out.println("a = " + a);
    }
}

public class UseStatic {
    static int a = 3;
    static int b;
    int c = 5;

    static void meth(int x) {
        System.out.println("Static meth initialize.");
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialize.");
        b = a * 4;
    }

    void test_method(){
        System.out.println("test_method");
    }

    public static void main(String args[]) {
        System.out.println("Main method");
        meth(42);
        UseStatic ob = new UseStatic();
        ob.test_method();

        StaticDemo.callme();
        System.out.println("StaticDemo b: " + StaticDemo.b);
    }
}