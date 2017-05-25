/**
 * Created by vallep on 5/25/2017.
 *
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Double d1 = new Double(3.14159);
        Double d2 = new Double("3.14159");

        System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));

        Double d3 = new Double(1/0.);
        Double d4 = new Double(0/0.);

        System.out.println(d3 + ": " + d3.isInfinite() + ", " + d3.isNaN());
        System.out.println(d4 + ": " + d4.isInfinite() + ", " + d4.isNaN());

        Integer i1 = new Integer("10");
        int total = i1 + 10;
        System.out.println("i1: " + i1 + " Total: " + total);
    }
}