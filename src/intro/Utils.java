package intro;

import java.util.Scanner;

/**
 * Created by User on 19.02.2016.
 */
public class Utils {

    public static int[] getArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = scanner.nextInt();

        System.out.println("Fill up the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            }else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
