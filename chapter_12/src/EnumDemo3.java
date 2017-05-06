/**
 * Created by valle on 06/05/2017.
 *
 */
enum Apple1 {
    Jonathan(10), GoldenDel, RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple1(int p) { price = p;}

    // overload the constructor
    Apple1() { price = -1; }

    int getPrice() { return price;}
}

public class EnumDemo3 {
    public static void main(String args[]) {

        Apple1 ap1, ap2, ap3;

        System.out.println("Winesap costs " + Apple1.Winesap.getPrice() + " cents.\n");
        System.out.println("All apple prices:");
        for( Apple1 a : Apple1.values())
            System.out.println(a + " costs " + a.getPrice() + " cents.");

        System.out.println("\nWinesap ordinal " + Apple1.Winesap.ordinal());

        ap1 = Apple1.RedDel;
        ap2 = Apple1.RedDel;
        ap3 = Apple1.GoldenDel;

        if(ap1.compareTo(ap3) < 0 )
            System.out.println(ap1 + " comes before " + ap2);

        if(ap1.compareTo(ap3) > 0 )
            System.out.println(ap3 + " comes before " + ap1);

        if(ap1.compareTo(ap2) == 0 )
            System.out.println(ap1 + " equals " + ap2);

        if(ap1.equals(ap3))
            System.out.println("Error!");

        if(ap1.equals(ap3))
            System.out.println("Error!");

        if(ap1.equals(ap2))
            System.out.println(ap1 + " equals " + ap2);

        if(ap1 == ap2)
            System.out.println(ap1 + " == " + ap2);
    }




}
