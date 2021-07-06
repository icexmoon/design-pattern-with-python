package pattern9.take_out_v4.src;

import java.util.Iterator;

public class NullIterator<T> implements Iterator<T> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

}
