/**
 * Created by vallep on 5/20/2017.
 *
 */

interface MyNumber {
    double getValue();
}
public class LambDemo {
    public static void main(String[] args) {
        MyNumber myNum;

        myNum = () -> 123.45;

        System.out.println("A fixed value: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());
    }
}
