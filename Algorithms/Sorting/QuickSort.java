package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] array = {2018, 2005, 2023, 2010, 1998, 2015};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = particion(array, left, right);
            quickSort(array, left, pivot-1);
            quickSort(array, pivot+1, right);
        }
    }
    public static int particion(int[] array, int left, int right) {
        int pivot = array[right];

        int i = left -1;
        int j = left;
        while (j < right) {
            if (array[j] <= pivot) {
                i = i + 1;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            j++;
        }
        int temp = array[i+1];
        array[i+1] = array[right];
        array[right] = temp;
        return i+1;
    }

}
