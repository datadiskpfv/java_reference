/**
 * Created by vallep on 4/22/2017.
 */

class A2 {
    A2() {
        System.out.println("Inside A2's constructor");
    }

    void show() {
        System.out.println("A2 show method");
    }
}

class B2 extends A2 {
    B2() {
        System.out.println("Inside B2's constructor");
    }

    void show() {
        System.out.println("B2 show method");
    }
}

class C2 extends B2 {
    C2() {
        System.out.println("Inside C2's constructor");
    }

    void show(String msg) {
        System.out.println("C2 show method");
    }
}

public class CallingCons {

    public static void main(String args[]) {
        C2 c = new C2();

        c.show("Hello World");
        c.show();
    }
}