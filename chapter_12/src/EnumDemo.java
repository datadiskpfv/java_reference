/**
 * Created by valle on 06/05/2017.
 *
 */
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String args[]) {
        Apple ap;

        ap = Apple.RedDel;

        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel");

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;
        }

        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);

        System.out.println(Apple.valueOf("Winesap"));
    }
}