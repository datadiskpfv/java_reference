/**
 * Created by vallep on 4/22/2017.
 */

interface MyIF {
    int getNumber();

    default String getString() {
        return "Default String from default interface";
    }

    static void getStaticString() {
        System.out.println("You called the interfaces static method");
    }
}

class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }

    public String getString() {
        System.out.println(MyIF.super.getString());
        return "return String from class";
    }
}
public class DefaultInterface {
    public static void main(String args[]) {
        MyIF if1 = new MyIFImp();
        System.out.println(if1.getNumber());
        System.out.println(if1.getString());

        // called the static method in the interface directly
        MyIF.getStaticString();

        // interfaces static methods are not inherited, so cannot do below
        //MyIFImp.getStaticString();
    }
}