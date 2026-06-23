package Sorting;

import java.util.Arrays;

public class Sorting {
    static void main() {

    String[] stringArray = {"a", "d", "z", "e", "r", "b"};
    int[] intArray = {2, 65, 34, 2, 1, 7, 8};
    Arrays.sort(stringArray);
    Arrays.sort(intArray);

    System.out.println(Arrays.toString(stringArray));
    System.out.println(Arrays.toString(intArray));

    }
}
