package patterns.iterator;

import java.util.Iterator;

/**
 * Created by MBCNEWMAIN on 25.03.2016.
 */
public class ArrayIterator implements Iterator {
    private Integer[] array;
    private int currentIndex = 0;

    public ArrayIterator(Integer[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public Object next() {
        return array[currentIndex++];
    }
}
