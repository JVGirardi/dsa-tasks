package ArraysExercises;

import java.util.HashSet;
import java.util.Set;

public class ContainsCommonItem {
    //Given 2 arrays, create a function that let's a user know
    // (true/false) whether these two arrays contain any common items
    //cons array1 = ['a', 'b', 'c', 'x'];
    //cons array2 = ['z', 'y', 'i'];
    //should return false
    //cons array1 = ;
    //cons array2 = ['z', 'y', 'x'];
    //should return true
    static void main() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'x'};
        System.out.println(containsCommonItem(array1, array2));
    }

    private static boolean containsCommonItem(char[] array1, char[] array2) {
        if (array1 == null || array2 == null) return false;
        Set<Character> itensVistos = new HashSet<>();

        char[] menorArray = array1.length < array2.length ? array1 : array2;
        char[] maiorArray = array1.length < array2.length ? array2 : array1;

        for (char letter : menorArray) {
            itensVistos.add(letter);
        }

        for (char letter : maiorArray) {
            if (itensVistos.contains(letter)) {
                return true;
            }
        }
        return false;
    }
}
