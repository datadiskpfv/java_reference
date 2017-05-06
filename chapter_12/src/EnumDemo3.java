/**
 * Created by valle on 06/05/2017.
 *
 */
enum Apple1 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple1(int p) { price = p;}

    int getPrice() { return price;}
}

public class EnumDemo3 {
    public static void main(String args[]) {

        System.out.println("Winesap costs " + Apple1.Winesap.getPrice() + " cents.\n");
        System.out.println("All apple prices:");
        for( Apple1 a : Apple1.values())
            System.out.println(a + " costs " + a.getPrice() + " cents.");
    }
}
