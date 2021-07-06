package pattern9.take_out_v3.src;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int currentIndex = -1;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (currentIndex >= array.length - 1 || array[currentIndex + 1] == null) {
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        T next = array[currentIndex + 1];
        currentIndex++;
        return next;
    }

}
