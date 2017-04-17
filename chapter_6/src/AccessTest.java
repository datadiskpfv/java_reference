/**
 * Created by vallep on 4/17/2017.
 *
 */
class TestAT {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String args[]) {
        TestAT ob = new TestAT();

        ob.a = 10;
        ob.b = 20;

        //ob.c = 100;

        ob.setc(100);
        ob.getc();

        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
