/**
 * Created by vallep on 5/14/2017.
 *
 */
class Gen3<T> {
    private T ob;

    Gen3(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen4<T, V> extends Gen3<T> {
    private V ob2;

    Gen4(T o, V o2){
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}

public class HeirDemo {
    public static void main(String[] arg) {
      Gen4<String, Integer> x = new Gen4<>("Value is: ", 99);
      Gen4<String, String> x2 = new Gen4<>("Hello", "World");
        Gen4<String, Integer> x3 = new Gen4<>("Value is: ", 98);

        System.out.println(x.getOb());
        System.out.println(x.getob2());

        // you cannot do the below as at compile time it is not known
        // if (x instanceof Gen4<String, Integer>)

        if (x instanceof Gen4<?, ?>)
            System.out.println("x is instanceOf Gen4<String, Integer>");

        if (x2 instanceof Gen4<?, ?>)
            System.out.println("x2 is instanceOf Gen4<String, String>");
    }
}