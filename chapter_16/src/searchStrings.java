/**
 * Created by vallep on 5/21/2017.
 */
public class searchStrings {
    public static void main(String[] args) {
        String s1 = "All good things come to those who wait";

        char c = 'w';
        System.out.println("good index: " + s1.indexOf("good"));
        System.out.println("w - first index: " + s1.indexOf(c));
        System.out.println("w - last index: " + s1.lastIndexOf(c));

    }
}
