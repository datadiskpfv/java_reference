/**
 * Created by vallep on 5/13/2017.
 *
 */
class Gen<T> {
    private T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
public class GenDemo {
    public static void main(String[] args) {

        // java will autobox 88 to a Integer
        Gen<Integer> iOb = new Gen<>(88);

        int v = iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<> ("Generics Test");

        strOb.showType();

        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}