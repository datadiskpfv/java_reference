/**
 * Created by vallep on 5/20/2017.
 *
 */
interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;


        MyFunc myLambda = (n) -> {
            int v = num + n;

            // cannot change num as it is final
           // num++;

            return v;
        };
    }
}
