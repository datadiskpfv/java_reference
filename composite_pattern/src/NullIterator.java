import java.util.Iterator;

/**
 * Created by vallep on 08/07/2017.
 *
 */
public class NullIterator implements Iterator {
    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
