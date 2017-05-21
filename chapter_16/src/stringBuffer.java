/**
 * Created by vallep on 5/21/2017.
 */
public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("toString: " + sb);
        System.out.println("length: " + sb.length());
        System.out.println("capacity: " + sb.capacity());
        System.out.println();

        sb.ensureCapacity(30);
        sb.setLength(3);
        System.out.println("capacity after ensureCapacity: " + sb.capacity());
        System.out.println("length: " + sb.length());
        System.out.println("toString: " + sb + ":");
        System.out.println();

        sb.append("lo world");
        System.out.println("append: " + sb + ":");

        sb.insert(6, "to the ");
        System.out.println("insert: " + sb + ":");
        System.out.println();

        System.out.println("reverse: " + sb.reverse());
        System.out.println("toString: " + sb + ":");
        System.out.println("reverse: " + sb.reverse());
        System.out.println("toString: " + sb + ":");
        System.out.println();

        // start, number of chars, replace with
        sb.replace(0, 5, "Good-Bye");
        System.out.println("toString: " + sb + ":");
        System.out.println();


    }
}
