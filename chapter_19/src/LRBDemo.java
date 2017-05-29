import java.util.*;

/**
 * Created by vallep on 5/29/2017.
 */
public class LRBDemo {
    public static void main(String[] args) {
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

        System.out.println("English version: ");
        System.out.println("  String for Title key: " + rd.getString("title"));
        System.out.println("  String for Stop text: " + rd.getString("StopText"));
        System.out.println("  String for Start text: " + rd.getString("StartText"));
        System.out.println();

        rd = ResourceBundle.getBundle("SampleRB_de");

        System.out.println("German version: ");
        System.out.println("  String for Title key: " + rd.getString("title"));
        System.out.println("  String for Stop text: " + rd.getString("StopText"));
        System.out.println("  String for Start text: " + rd.getString("StartText"));
    }
}
