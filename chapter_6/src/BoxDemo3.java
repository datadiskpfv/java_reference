/**
 * Created by vallep on 4/16/2017.
 *
 */

class Box3 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo3 {
    public static void main(String args[]) {
        Box3 mybox = new Box3();

        mybox.width = 3;
        mybox.height = 6;
        mybox.depth = 9;

        System.out.println("Volume is " + mybox.volume());
    }
}