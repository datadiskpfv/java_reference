/**
 * Created by vallep on 29/06/2017.
 */
public class Light {

    private String name = "";

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light is on");
    }

    public void off() {
        System.out.println(name + " light is off");
    }

    public String getName() {
        return this.name;
    }
}