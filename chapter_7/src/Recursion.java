/**
 * Created by vallep on 4/17/2017.
 *
 */

class Factorial {
    // this is a recursive method
    int fact(int n) {
        int result;

        if( n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 5 is " + f.fact(5));

    }
}
