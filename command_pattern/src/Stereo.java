/**
 * Created by vallep on 29/06/2017.
 */
public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void setCD() {
        System.out.println("Stereo CD now set");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo Volume now set to " + volume);
    }

    public String getName() {
        return this.name;
    }
}
