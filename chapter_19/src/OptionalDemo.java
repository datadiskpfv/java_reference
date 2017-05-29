import java.util.Optional;

/**
 * Created by vallep on 5/29/2017.
 *
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        if(noVal.isPresent()) System.out.println("This wont be displayed");
        else System.out.println("noVal has no value");

        if(hasVal.isPresent()) System.out.println("The string is hasVal is: " + hasVal.get());

        String defStr = noVal.orElse("Default string");
        System.out.println(defStr);
    }
}