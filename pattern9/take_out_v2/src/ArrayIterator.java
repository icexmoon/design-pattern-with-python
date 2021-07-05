package pattern9.take_out_v2.src;

public class ArrayIterator implements Iterator {
    private Object[] array;
    private int currentIndex = -1;

    public ArrayIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (currentIndex >= array.length - 1 || array[currentIndex+1] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object next = array[currentIndex + 1];
        currentIndex++;
        return next;
    }

}
