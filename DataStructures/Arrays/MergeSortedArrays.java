package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    static void main() {
        int[] array1 = {1, 6, 40};
        int[] array2 = {0, 3, 4, 31};
        //[0, 3, 4, 4, 6, 30 ,31]

        System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));


    }

    private static  int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int indexarray1 = 0;
        int indexarray2 = 0;
        int indexMain = 0;

        while (indexarray1 < array1.length && indexarray2 < array2.length) {
            if (array1[indexarray1] <= array2[indexarray2]) {
                array[indexMain] = array1[indexarray1];
                indexMain++;
                indexarray1++;
            } else {
                array[indexMain] = array2[indexarray2];
                indexMain++;
                indexarray2++;
            }
        }

            while (indexarray1 < array1.length) {
                array[indexMain] = array1[indexarray1];
                indexMain++;
                indexarray1++;
            }

            while (indexarray2 < array2.length) {
                array[indexMain] = array2[indexarray2];
                indexMain++;
                indexarray2++;
            }
        return array;
    }

}
