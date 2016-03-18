package collections;

import OOP.Cat;

import java.util.Comparator;

/**
 * Created by MBCNEWMAIN on 18.03.2016.
 */
public class CatComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;
        int result = cat1.getBirthYear() - cat2.getBirthYear();
        return result;
    }
}
