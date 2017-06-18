import java.util.*;
import java.util.stream.*;
/**
 * Created by vallep on 18/06/2017.
 *
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // this acts as the consumer
        Stream<Double> sqrtRootStrm = myList.stream().map(Math::sqrt);
        System.out.println("sqrtRootStrm: " + sqrtRootStrm);

        // this acts as the producer
        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0, (a,b) -> a*b);

        System.out.println("Product of square roots is " + productOfSqrtRoots);
    }
}
