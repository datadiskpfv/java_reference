/**
 * Created by vallep on 4/16/2017.
 *
 */

class BoxOL {
    private double width;
    private double height;
    private double depth;

    // first constructor
    BoxOL(double width, double height, double depth) {
        System.out.println("BoxOL normal constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // overloading the above constructor
    BoxOL(double len) {
        System.out.println("BoxOL double constructor");
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadBox {
    public static void main(String args[]) {
        BoxOL mybox1 = new BoxOL(3, 6, 9);
        BoxOL mybox2 = new BoxOL(10);

        System.out.println("Volume is " + mybox1.volume());
        System.out.println("Volume is " + mybox2.volume());
    }
}