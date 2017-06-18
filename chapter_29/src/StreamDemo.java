import java.util.*;
import java.util.stream.*;
/**
 * Created by vallep on 18/06/2017.
 *
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Original list: " + myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()) System.out.println("Minimum value: " + minVal.get());

        // Stream<Integer> sortedStream = myList.stream().sorted();
        Stream<Integer> sortedStream = myList.parallelStream().sorted();
        System.out.println("Sorted Stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        Stream<Integer> oddVals = myList.parallelStream().sorted().filter((n) -> (n % 2) == 1);
        System.out.println("Odd values: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //oddVals = myList.stream().filter( (n) -> (n % 2) == 1)
        //        .filter((n) -> n > 5);
        oddVals = myList.parallelStream().filter( (n) -> (n % 2) == 1)
                                 .filter((n) -> n > 5);
        System.out.println("Odd values greater than 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        System.out.println("Original list: " + myList);
    }
}
