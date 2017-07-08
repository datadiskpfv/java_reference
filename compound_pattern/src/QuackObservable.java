/**
 * Created by vallep on 08/07/2017.
 *
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}