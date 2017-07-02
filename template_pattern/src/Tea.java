/**
 * Created by vallep on 02/07/2017.
 */
public class Tea extends  CaffineBeverage {

    public Tea() {
        this.condiments = "slice of lemon";
        this.beverage = "tea";
    }

    public void brew() {
        System.out.println("Steeping the Tea");
    }

}
