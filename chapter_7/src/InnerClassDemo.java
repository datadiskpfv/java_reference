/**
 * Created by vallep on 4/17/2017.
 *
 */

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
        System.out.println("inner y: " + inner.y);
    }

    class Inner {
        int y = 150;

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
