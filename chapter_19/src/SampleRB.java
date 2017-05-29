import java.util.ListResourceBundle;

/**
 * Created by vallep on 5/29/2017.
 *
 */
public class SampleRB extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {

        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "My Program";

        resources[1][0] = "StopText";
        resources[1][1] = "Stop";

        resources[2][0] = "StartText";
        resources[2][1] = "Start";

        return resources;
    }
}
