package intro;

/**
 * Created by User on 19.02.2016.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 8};

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_index = j;
                }
            }
            int buf = array[i];
            array[i] = array[min_index];
            array[min_index] = buf;
        }

        Utils.printArray(array);
    }
}
