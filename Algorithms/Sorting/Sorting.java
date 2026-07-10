package Sorting;

import java.util.Arrays;

public class Sorting {
    static void main() {

        int[] intArray = {2, 65, 34, 2, 1, 7, 8};
        System.out.println(Arrays.toString(intArray));
        insertionSort(intArray);
        System.out.println(Arrays.toString(intArray));

    }

    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            boolean isOrdenado = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isOrdenado = false;
                }
            }
            if (isOrdenado) break;
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int posMenor = i;
            for(int j = 1 + i; j < array.length; j++) {
                if (array[j] < array[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                int temp = array[i];
                array[i] = array[posMenor];
                array[posMenor] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int atual = array[i];
            int j = i - 1;
            while (j >= 0 && atual < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = atual;
        }
    }
}
