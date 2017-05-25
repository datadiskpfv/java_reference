/**
 * Created by vallep on 5/25/2017.
 *
 */
class TestClone implements Cloneable {
    int a;
    double b;
    String p = new String("Paul");

    TestClone cloneTest() {
        try{
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}
public class CloneDemo {
    public static void main(String[] args) {

        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 10;
        x1.b = 20.98;

        x2 = x1.cloneTest();

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);

        System.out.println("x1.p: " + x1.p);
        System.out.println("x2.p: " + x2.p);

        x1.a = 15;
        x1.b = 25.98;
        x1.p = "Lorraine";
        x2.p = "Jessica";

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);

        System.out.println("x1.p: " + x1.p);
        System.out.println("x2.p: " + x2.p);

    }
}
