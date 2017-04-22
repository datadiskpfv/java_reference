/**
 * Created by vallep on 4/22/2017.
 */

interface Constants {
    // the below variables will be final
    int NO = 1;
    int YES = 2;
    int MAYBE = 3;
    int later = 4;      // don't have to be uppercase but should be

    void meth1();
}

// we can extend other interfaces
interface Constants2 extends Constants {
    int SOON = 5;
    int NEVER = 6;
}

public class SharedConstants implements Constants2 {
    public static void main(String args[]) {
        System.out.println(NO);
        System.out.println(YES);
        System.out.println(MAYBE);
        System.out.println(later);
        System.out.println(SOON);
        System.out.println(NEVER);

        // NO is final
        //NO = 5;
    }

    @Override
    public void meth1() {
        System.out.println("Hello World");
    }
}
