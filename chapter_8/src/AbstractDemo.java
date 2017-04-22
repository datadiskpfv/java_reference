/**
 * Created by vallep on 4/22/2017.
 *
 */

abstract class A4 {
    abstract void callme();

    void callmeToo() {
        System.out.println("This is a concrete method");
    }
}

class B4 extends A4 {
    void callme() {
        System.out.println("B's implementation of callme.");
    }

}
public class AbstractDemo {
    public static void main(String args[]) {
        B4 b = new B4();

        b.callme();
        b.callmeToo();
    }
}
