/**
 * Created by vallep on 4/22/2017.
 */
public class ObjectDemo {
    public static void main(String args[]) {
        Object o = new Object();

        System.out.println("Object toString: " + o.toString());
        System.out.println("Object hashCode: " + o.hashCode());
        System.out.println("Object class: " + o.getClass());

        if (o.equals(o)) {
            System.out.println("o equals o");
        }
    }
}
