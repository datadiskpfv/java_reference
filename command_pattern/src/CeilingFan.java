/**
 * Created by vallep on 02/07/2017.
 *
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " fan is on High");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " fan is on Medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " fan is on Low");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " fan is on off");
    }

    public int getSpeed() {
        return speed;
    }
}
