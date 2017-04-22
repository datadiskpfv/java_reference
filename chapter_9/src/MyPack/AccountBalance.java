/**
 * Created by vallep on 4/22/2017.
 *
 */
package MyPack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0)
            System.out.println("--> ");
        System.out.println(name + ": $" + bal);
    }
}
public class AccountBalance {
    public static void main(String args[]) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("Paul Valle", 100.00);
        current[1] = new Balance("Lorraine Valle", 150.00);
        current[2] = new Balance("Jessica Valle", 200.00);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
