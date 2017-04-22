/**
 * Created by vallep on 4/22/2017.
 *
 */

interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void anotherCallback() {
        System.out.println("another callback method inside client");
    }
}

public class TestIface {
    public static void main(String args[]) {
        Callback cb1 = new Client();
        cb1.callback(100);

        Client cb2 = new Client();
        cb2.callback(200);
        cb2.anotherCallback();
    }
}