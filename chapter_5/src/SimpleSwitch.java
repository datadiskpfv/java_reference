/**
 * Created by vallep on 4/16/2017.
 *
 */
public class SimpleSwitch {
    public static void main(String args[]) {
        for(int i=0; i<6; i++) {
            // the compiler will create a jump table for each case constant and use this table
            // to jump to the correct answer
            switch(i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }
        }

        System.out.println();
        String str = "Hello";

        switch(str) {
            case "Hello":
                System.out.println("found Hello");
                break;
            default:
                System.out.println("did not found Hello");
        }
    }
}