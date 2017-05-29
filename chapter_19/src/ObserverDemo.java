import java.util.*;

/**
 * Created by vallep on 5/29/2017.
 *
 */
class Watcher implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update() called, count is " + ((Integer)arg).intValue());
    }
}

class BeingWatched extends Observable {
    void counter(int period) {
        for( ; period >= 0; period--) {
            setChanged();
            notifyObservers(new Integer(period));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();

        observed.addObserver(observing);
        observed.counter(10);
    }
}