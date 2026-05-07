package InterviewQuestions;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        //given 2 arrays, create a function that let's a user know (true/false) whether these two arrays
        //contain any common items
        //For example:
        //array1 = ['a', 'b', 'c, 'x']
        //array2 = ['z', 'y', 'i']
        //should return false
        //----------
        //array1 = ['a','b','c','x']
        //array2 = ['z', 'y', 'x']
        //should return true

        List<String> array1 = List.of("a", "b", "c", "x");
        List<String> array2 = List.of("z", "y", "i");

        boolean contains = containAnyCommonItem(array1, array2);
        System.out.println(contains);


    }

    private static boolean containAnyCommonItem(List<String> array1, List<String> array2) {
        if (array1 == null || array2 == null || array1.isEmpty() || array2.isEmpty()) return false;

        Set<String> set1 = new HashSet<>();
        for(String letter : array1) {
            set1.add(letter.toUpperCase());
        }

        for(String letter : array2) {
            if (set1.contains(letter.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
