/**
 * Created by vallep on 5/21/2017.
 *
 */
public class getCharsDemo {
    public static void main(String[] args) {
        String s = "This is a demo of the getChars method";

        int start = 10;
        int end = 14;

        char[] buf = new char[end - start];

        // source start, source end, destination, start destination
        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        char[] buf2 = s.toCharArray();

        int count = 0;
        for (char b : buf2) {
            System.out.print(b);
            count++;
        }
        System.out.println("\nCount: " + count);
    }
}
