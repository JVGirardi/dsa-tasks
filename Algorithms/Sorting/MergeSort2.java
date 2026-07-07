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
        if (array.length < 2) {
            return;
        }

        int[] leftSide = new int[array.length/2];
        int[] rightSide = new int[array.length-(array.length/2)];

        int i= 0;
        while (i < leftSide.length) {
            leftSide[i] = array[i];
            i++;
        }
        int r = 0;
        while (r < rightSide.length) {
            rightSide[r] = array[i];
            r++;
            i++;
        }

        mergeSort2(leftSide);
        mergeSort2(rightSide);
        merge(leftSide, rightSide, array);
    }

    public static void merge(int[] left, int[] right, int[] total) {
        int i = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                total[i] = left[l];
                l++;
            } else {
                total[i] = right[r];
                r++;
            }
            i++;
        }

        while (l < left.length) {
            total[i] = left[l];
            i++;
            l++;
        }
        while (r < right.length) {
            total[i] = right[r];
            i++;
            r++;
        }
    }
}
