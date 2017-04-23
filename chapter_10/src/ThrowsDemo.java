/**
 * Created by vallep on 4/23/2017.
 *
 */

class ThrowsDemo {
    private static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}