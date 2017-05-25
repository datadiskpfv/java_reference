import java.util.Arrays;

/**
 * Created by vallep on 5/25/2017.
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println(System.getenv());
        System.out.println(System.getProperties());
        System.out.println(System.getSecurityManager());
        System.out.println(System.currentTimeMillis());

        int[] a = { 1, 2, 3, 4, 5};
        int[] b = { 6, 7, 8, 9, 10};

        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
    }
}