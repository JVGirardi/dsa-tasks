package Sorting;

import java.util.Arrays;

public class MergeSort {
    static void main() {

//        merge sort = recursively divide array in 2, sort, re-combine;
//        run-time complexity = O(n Log n);
//        space complexity = 0(n);


        int[] array = {6, 5};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void mergeSort(int[] array) {

        if (array.length <= 1) {
            return;
        }

        int leftArraySize = array.length/2;
        int rightArraySize = array.length-leftArraySize;
        int[] arrayLeft = new int[leftArraySize];
        int[] arrayRight = new int[rightArraySize];

         int i = 0, l = 0, r = 0;

         while (l < arrayLeft.length) {
             arrayLeft[l++] = array[i++];
         }
         while (r < arrayRight.length) {
             arrayRight[r++] = array[i++];
         }

        mergeSort(arrayLeft);
        mergeSort(arrayRight);
        merge(arrayLeft, arrayRight, array);
    }

    private static void merge(int[] arrayLeft, int[] arrayRight, int[]mainArray) {

        int i = 0, l = 0, r = 0;

        while (l < arrayLeft.length && r < arrayRight.length) {
            if (arrayLeft[l] < arrayRight[r]) {
                mainArray[i++] = arrayLeft[l++];
            } else {
                mainArray[i++] = arrayRight[r++];
            }
        }

        while (l < arrayLeft.length) {
            mainArray[i++] = arrayLeft[l++];
        }

        while (r < arrayRight.length) {
            mainArray[i++] = arrayRight[r++];
        }
    }

}
