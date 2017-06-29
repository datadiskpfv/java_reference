/**
 * Created by vallep on 29/06/2017.
 */
public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
        //stereo.setCD();
        //stereo.setVolume(11);
    }
}
