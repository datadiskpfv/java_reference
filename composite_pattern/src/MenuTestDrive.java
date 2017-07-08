/**
 * Created by vallep on 08/07/2017.
 *
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "lunch");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes", "Top Blueberries on nice pancakes", false, 3.99
        ));

        dinerMenu.add(new MenuItem(
                "Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice-cream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
