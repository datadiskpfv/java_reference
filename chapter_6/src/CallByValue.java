/**
 * Created by vallep on 4/16/2017.
 *
 */
class TestCBV {

    int a, b;

    TestCBV(int i, int j){
        a = i;
        b = j;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(TestCBV o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class CallByValue {
    public static void main(String args[]) {

        int a = 10, b = 15;
        System.out.println("a and b original values: " + a + " " + b);

        TestCBV ob = new TestCBV(a, b);

        ob.meth(a, b);
        System.out.println("a and b passing by value: " + a + " " + b);

        System.out.println("ob.a and ob.b passing by value: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b passing by reference: " + ob.a + " " + ob.b);
    }
}
