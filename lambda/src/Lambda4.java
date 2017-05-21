/**
 * Created by vallep on 5/21/2017.
 *
 */

@FunctionalInterface
interface Calculate {
    int calc(int x, int y);
}

public class Lambda4 {
    public static void main(String[] args) {

        Calculate add = (a, b) -> a + b;
        System.out.println("Result of add: " + add.calc(3, 2));

        Calculate divide = (a, b) -> (b != 0 ? a/b : 0);
        System.out.println("Result of divide: " + divide.calc(12, 3));

        Calculate multiply = (a, b) -> a * b;
        System.out.println("Result of multiply: " + multiply.calc(5, 5));
    }
}
