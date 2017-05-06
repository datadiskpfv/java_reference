/**
 * Created by valle on 06/05/2017.
 */
public class AutoBox2 {

    static int m(Integer v) {
        return v;
    }

    public static void main(String args[]) {
        Integer iOb = m(99);
        System.out.println(iOb);

        // will unautobox, add one to int, then autobox back again
        ++iOb;
        System.out.println(iOb);

        Integer iOb2 = iOb + iOb / 20;
        System.out.println(iOb2);

        Double dOb = 12.5;
        dOb = dOb + iOb;
        System.out.println(dOb);

    }
}