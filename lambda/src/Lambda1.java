import java.util.function.*;

/**
 * Created by vallep on 5/21/2017.
 *
 */
public class Lambda1 {
    public static void main(String[] args) {
        // using Predicate
        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

        // using consumer which uses the accept method
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("ABCDEFGHIJKLMNOPQRSTUVXYZ");

        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("add 10 + 25: " + add.apply(10, 25));

        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("This is my message in upper case"));
    }
}