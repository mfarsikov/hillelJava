package patterns.iterator;

import OOP.Cat;
import collections.CustomLinkedList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by MBCNEWMAIN on 25.03.2016.
 */
public class IteratorMain {
    public static void main(String[] args) {
        Integer[] integersArray = new Integer[10];

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Iterator arrayIterator = new ArrayIterator(integersArray);

        iterate(arrayIterator);

        CustomLinkedList linkedList = new CustomLinkedList();

        linkedList.add(new Cat("Tom", "Grey", 2015));
        linkedList.add(new Cat("Tom", "Grey", 2015));
        linkedList.add(new Cat("Tom", "Grey", 2015));

        Iterator linkedListIterator = linkedList.iterator();

        iterate(linkedListIterator);

        for(Object o : linkedList){
            System.out.println(o);
        }

    }

    public static void iterate(Iterable iterable){
        Iterator iterator = iterable.iterator();
        iterate(iterator);
    }


    public static void iterate(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void iterate(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }

    public static void iterate(Integer[] integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

}
