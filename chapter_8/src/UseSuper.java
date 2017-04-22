/**
 * Created by vallep on 4/22/2017.
 *
 */

class A1 {
    int i;
}

class B1 extends A {
    int i;

    B1(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class UseSuper {
    public static void main(String args[]) {
        B1 subOb = new B1(1, 2);

        subOb.show();
    }
}