/**
 * Created by vallep on 4/16/2017.
 *
 */

class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim ( double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo4 {
    public static void main(String args[]) {
        Box4 mybox = new Box4();

        mybox.setDim(3, 6, 9);

        System.out.println("Volume is " + mybox.volume());
    }
}