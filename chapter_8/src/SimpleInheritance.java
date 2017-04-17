/**
 * Created by vallep on 4/17/2017.
 *
 */

// create a superclass
class A {
    int i, j;
    // no other classes can access a private variable
    // only accessible within its own class
    private int l;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
      System.out.println("k: " + k);
    }

    void showl() {
        // System.out.println("l: " + l);  private l cannot be accessed in class B
        System.out.println();
    }

    void sum() {
        System.out.println("i+k+j = " + (i+j+k));
    }
}

public class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();

        // the superclass may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        /* the subclass has access to all public members of
           its superclass
         */

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
    }
}
