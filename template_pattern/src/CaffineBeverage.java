import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vallep on 02/07/2017.
 *
 */
public abstract class CaffineBeverage {

    String condiments;
    String beverage;

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    public void addCondiments() {
        System.out.println("Adding " + condiments + " to your " + beverage);
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        String answer = getUseInput();

        if( answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUseInput() {
        String answer = null;

        System.out.println("Would you like " + condiments + " " + beverage + " (y/n): ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
