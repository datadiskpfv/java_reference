/**
 * Created by vallep on 4/22/2017.
 *
 */
class A3 {
    void callme() {
        System.out.println("Inside A callme method");
    }
}

class B3 extends A3{
    void callme() {
        System.out.println("Inside B callme method");
    }
}

class C3 extends B3 {
    void callme() {
        System.out.println("Inside C callme method");
    }
}

public class Dispatch {
    public static void main(String args[]) {
         A3 a = new A3();
         B3 b = new B3();
         C3 c = new C3();

         A3 r;

         r = a;
         r.callme();

         r = b;
         r.callme();

         r = c;
         r.callme();
    }
}
