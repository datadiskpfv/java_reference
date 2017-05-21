import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 * Created by vallep on 5/21/2017.
 *
 */
public class Lambda3 {
    public static void main(String[] args) {

        // lambda
        IntFunction<String> intToString = num -> Integer.toString(num);
        System.out.println("expected value 3, actual value: " + intToString.apply(123).length());

        // same as above but using a reference method
        IntFunction<String> intToString2 = Integer::toString;
        System.out.println("expected value 4, actual value: " + intToString2.apply(4567).length());

        // again using a reference method
        Consumer<String> print = System.out::println;
        print.accept("Coming to you directly from a lambda");

        // use the String concat
        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Paul"));
    }
}
