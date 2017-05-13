/**
 * Created by vallep on 5/13/2017.
 *
 */

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends C {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if( a instanceof  A)
            System.out.println("a is instance of A");
        if( b instanceof  B)
            System.out.println("b is instance of B");

        if( c instanceof A )
            System.out.println("c is instance of A");

        if( d instanceof C )
            System.out.println("d is instance of C");

        if( d instanceof A )
            System.out.println("d is instance of A");

        if( d instanceof Object )
            System.out.println("d is instance of Object");
    }
}
