package Sorting;

import java.util.Arrays;

public class MergeSort2 {
    static void main() {
        int[] array = {2018, 2005, 2023, 2010, 1998, 2015};
        System.out.println(Arrays.toString(array));
        mergeSort2(array);
        System.out.println(Arrays.toString(array));

    }

    public static void mergeSort2(int[] array) {
       if (array.length <= 1) {
           return;
       }

       int leftSize = array.length/2;
       int[] leftArray = new int[leftSize];
       int rightSize = array.length-leftSize;
       int[] rightArray = new int[rightSize];

       int i = 0;
       while (i < leftArray.length) {
           leftArray[i] = array[i];
           i++;
       }
       int j = 0;
       while (j < rightArray.length) {
           rightArray[j] = array[i];
           j++;
           i++;
       }
       mergeSort2(leftArray);
       mergeSort2(rightArray);
       merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] mainArray) {

        int left =0, right = 0, i = 0;

        while (left < leftArray.length && right < rightArray.length) {
            if (leftArray[left] < rightArray[right]) {
                mainArray[i++] = leftArray[left++];
            } else {
                mainArray[i++] = rightArray[right++];
            }
        }

        while (left < leftArray.length) {
            mainArray[i++] = leftArray[left++];
        }

        while (right < rightArray.length) {
            mainArray[i++] = rightArray[right++];
        }

    }


}
