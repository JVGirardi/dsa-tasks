package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] array = {2018, 2005, 2023, 2010, 1998, 2015};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void selectionSort(int[] array) {


        for (int i = 0; i< array.length -1 ; i++) {
            int menor = array[i];
            int posMenor = i;
            for (int j = 1 + i; j < array.length; j++) {
                if (array[j] < menor) {
                    menor = array[j];
                    posMenor = j;
                }
            }
            int temp = array[i];
            array[i] = menor;
            array[posMenor] = temp;
        }
    }
}
