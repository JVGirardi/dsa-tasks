package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j-1] < array[j] ) break;
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }

    private static void insertionSortRef(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }
}
