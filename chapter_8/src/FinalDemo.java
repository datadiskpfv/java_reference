/**
 * Created by vallep on 4/22/2017.
 */

class F1 {
    // prevent the below method from being overridden
    final void fmeth() {
        System.out.println("Final method fmeth");
    }
}


// prevent the below class from being extended
final class F2 extends F1{
    double f;

    // you cannot override a final method
    //void fmeth() {
    //   System.out.println("Final method overridden");
    //}
}

// you cannot extend a final class
//class F3 extends F2 {
//}
public class FinalDemo {
    public static void main(String args[]) {
        F2 f2 = new F2();
        f2.fmeth();
    }
}