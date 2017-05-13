/**
 * Created by vallep on 5/13/2017.
 *
 */

// notice the extends which bounds the T to a Number class
class TwoGen<T extends Number, V> {
    private T ob1;
    private V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Double, String> tgObj = new TwoGen<>(88.0, "Generics");

        tgObj.showTypes();

        double v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}
