import java.util.Iterator;

/**
 * Created by vallep on 02/07/2017.
 *
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99);

        addItem("BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the dat", "Soup of the day, with side of potato salard", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
