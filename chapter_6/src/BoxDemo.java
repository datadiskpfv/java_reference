/**
 * Created by vallep on 4/16/2017.
 *
 */

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3 = mybox2;

        System.out.println("mybox1 address: " + System.identityHashCode(mybox1) + " " + mybox1);
        System.out.println("mybox2 address: " + System.identityHashCode(mybox2) + " " + mybox2);
        System.out.println("mybox3 address: " + System.identityHashCode(mybox3) + " " + mybox3);

        System.out.println();

        double vol1;
        double vol2;

        // assign values to the boxes variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // compute volume of the boxes
        vol1 = mybox1.width * mybox1.height * mybox1.depth;
        vol2 = mybox2.width * mybox2.height * mybox2.depth;

        System.out.println("Volume is " + vol1);
        System.out.println("Volume is " + vol2);
    }
}