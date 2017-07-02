import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vallep on 02/07/2017.
 */
public class Coffee extends CaffineBeverage {

    public Coffee() {
        this.condiments = "Sugar and Milk";
        this.beverage = "Coffee";
    }

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

}
