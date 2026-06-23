package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] array = {2018, 2005, 2023, 2010, 1998, 2015};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array){

        for (int i= 0; i < array.length -1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (array.length - 1) - i; j++) {
                if (array[j] > array[j+1]) {
                    //swappando
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
