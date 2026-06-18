package Recursion;

import java.util.Arrays;

public class ReverseString {
    static void main() {
        String input = "hello";
        String input2 = "Java 123";
        System.out.println(reverseWithRecursion(input, 0, input.length()-1));
    }


    public static String reverseWithRecursion(String input, int left, int right) {
        if (input == null) return null;
        String[] array = input.split("");
        if (left >= right) return String.join("", array);
        String temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        return reverseWithRecursion(String.join("", array), left + 1, right - 1);
    }
}
