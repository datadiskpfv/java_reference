import java.awt.*;
import java.util.Iterator;

/**
 * Created by vallep on 08/07/2017.
 *
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();

            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}