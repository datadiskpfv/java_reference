/**
 * Created by vallep on 4/16/2017.
 *
 */

class Box5 {
    private double width;
    private double height;
    private double depth;

    Box5(double width, double height, double depth) {
        System.out.println("Box5 constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    // this may never be called, and only gets called just before the GC runs
    protected void finalize() {
        System.out.println("calling Box5 finalize method");
    }
}

public class BoxDemo5 {
    public static void main(String args[]) {
        Box5 mybox = new Box5(3, 6, 9);

        System.out.println("Volume is " + mybox.volume());

        mybox = null;
    }
}