package OOP;

import java.util.Arrays;

/**
 * Created by MBCNEWMAIN on 11.03.2016.
 */
public class Sorter {
    public void sort(Comparable[] unsorted) {
        boolean swap = false;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (unsorted[i].compareTo(unsorted[i + 1]) > 0) {
                    Comparable temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }

    public static void main(String[] args) {
        int[] a = {9, 5, 8, 4, 3, 7};
        String[] s = {"a", "b", "e", "c"};
        new Sorter().sort(s);
        System.out.println(Arrays.toString(s));



    }

}
