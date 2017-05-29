import java.util.ListResourceBundle;

/**
 * Created by vallep on 5/29/2017.
 */
public class SampleRB_de extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {

        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "Mein Program";

        resources[1][0] = "StopText";
        resources[1][1] = "Anschlag";

        resources[2][0] = "StartText";
        resources[2][1] = "Anfang";

        return resources;
    }
}
