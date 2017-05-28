import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by vallep on 5/28/2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Paul Valle", 1000.00);
        hm.put("Lorraine Valle", 2000.00);
        hm.put("Dominic Valle", 3000.00);
        hm.put("Jessica Valle", 4000.00);

        Set<Map.Entry<String,Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("Paul Valle");
        hm.put("Paul Valle", balance + 1000);

        System.out.println("Paul Valle's new balance: " + hm.get("Paul Valle"));
    }
}
