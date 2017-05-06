/**
 * Created by valle on 06/05/2017.
 */
public class TypeWrappers {
    public static void main(String args[]){

        // boxing
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(101);

        Double d1 = new Double(12.5);
        Double d2 = new Double(20.5);

        System.out.println("Integer One: " + i1);
        System.out.println("Integer Two: " + i2);

        System.out.println("Double One: " + d1);
        System.out.println("Double Two: " + d2);

        // unboxing
        int i = i1.intValue();
        double d = d1.doubleValue();

        System.out.println("i = " + i + "\nd = " + d);
    }
}
