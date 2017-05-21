import java.util.function.BiFunction;

/**
 * Created by vallep on 5/21/2017.
 */
public class Lambda2 {
    public static void main(String[] args) {

        // old way not using lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run 1");
            }
        };

        // new way using lambda
        Runnable r2 = () -> System.out.println("run 2");

        r1.run();
        r2.run();

        // first two are inputs the last one is the return value
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        String sentence = concat.apply("Today is ", "a great day");
        System.out.println(sentence);
    }
}
