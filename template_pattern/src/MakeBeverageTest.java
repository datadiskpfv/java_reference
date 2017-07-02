/**
 * Created by vallep on 02/07/2017.
 */
public class MakeBeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println();
        coffee.prepareRecipe();
    }
}