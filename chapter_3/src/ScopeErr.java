/**
 * Created by vallep on 4/15/2017.
 */
public class ScopeErr {
    public static void main(String args[]) {
        int bar = 1;

        {
            // compile error, bar is already defined
            //int bar = 2;
        }
    }
}
