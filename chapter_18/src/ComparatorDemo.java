import java.util.*;

/**
 * Created by vallep on 5/29/2017.
 *
 */

class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        System.out.println(aStr + " -> " + bStr + " = " + aStr.compareTo(bStr));
        return aStr.compareTo(bStr);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp().reversed());

        System.out.println("Adding C");
        ts.add("C");

        System.out.println("Adding A");
        ts.add("A");

        System.out.println("Adding B");
        ts.add("B");

        System.out.println("Adding E");
        ts.add("E");

        System.out.println("Adding F");
        ts.add("F");

        System.out.println("Adding D");
        ts.add("D");

        System.out.println("Finished adding elements");

        for(String element : ts)
            System.out.println(element + " ");
        System.out.println();

        Comparator<String> mc = (cStr, dStr) -> cStr.compareTo(dStr);

        TreeSet<String> ts2 = new TreeSet<>(mc.reversed());

        ts2.add("Z");
        ts2.add("W");
        ts2.add("Y");
        ts2.add("V");
        ts2.add("X");
        ts2.add("U");

        for(String element2 : ts2)
            System.out.println(element2 + " ");
        System.out.println();
    }
}
