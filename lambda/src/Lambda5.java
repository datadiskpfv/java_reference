import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by vallep on 5/21/2017.
 *
 */
public class Lambda5 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Paul", "Lorraine", "Dominic", "Jessica");

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (a, b) -> b.compareTo(a));
    }
}
