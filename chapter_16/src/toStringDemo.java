/**
 * Created by vallep on 5/21/2017.
 *
 */

class A {
    public String toString() {
        return "Class A";
    }
}

class B {
    public String toString() {
        return "Class B";
    }
}

public class toStringDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object o = new Object();

        System.out.println(a);
        System.out.println(b);
        System.out.println(o);
    }
}
