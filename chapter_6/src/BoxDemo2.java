/**
 * Created by vallep on 4/16/2017.
 *
 */
class Box2 {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo2 {
    public static void main(String args[]) {
        Box2 mybox = new Box2();

        mybox.width = 3;
        mybox.height = 6;
        mybox.depth = 9;

        mybox.volume();
    }
}