import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by vallep on 5/21/2017.
 */
public class Lambda6 {
    public static void main(String[] args) {

        // using lambdas
        Arrays.asList("red", "green", "blue")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // shorter way to do above
        Stream.of("red", "green", "blue")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // using lambdas
        Stream.of("black","red", "green", "blue")
                .filter(color -> { return color.startsWith("b");} )
                // the below makes it a terminal event
                .forEach(color -> System.out.println("Starts with b: " + color));

        // use lambdas to convert double to ints
        Stream.of(1.5, 2.7, 3.1)
                .mapToInt(Double::intValue)
                .forEach(System.out::print);
        System.out.println();

        // use lambdas to convert double to ints plus add our own text
        Stream.of(1.5, 2.7, 3.1)
                .mapToInt(Double::intValue)
                .forEach(num -> System.out.print(num + " "));
    }
}