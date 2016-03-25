package patterns.iterator;

import collections.ListElement;

import java.util.Iterator;

/**
 * Created by MBCNEWMAIN on 25.03.2016.
 */
public class CustomLinkedListIterator implements Iterator {

    private ListElement next;

    public CustomLinkedListIterator(ListElement next) {
        this.next = next;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Object next() {
        Object value = next.getValue();
        next = next.getNext();
        return value;
    }
}
