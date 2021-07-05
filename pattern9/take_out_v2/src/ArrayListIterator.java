package pattern9.take_out_v2.src;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    private ArrayList<Object> arrayList;
    private int nextIndex = 0;

    public ArrayListIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        if (nextIndex >= arrayList.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return arrayList.get(nextIndex++);
    }

}
