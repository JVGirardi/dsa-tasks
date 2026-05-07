package HashTables;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringNumber {
    static void main() {
        //Given an array = [2,5,1,2,3,5,1,2,4]:
        //It should return 2

        //Given an array = [2,1,1,2,3,5,1,2,4]:
        //It should return 1

        //Given an array = [2,3,4,5]:
        //It should return undefined
        int[] array = {2, 5, 1, 2, 3, 5, 1, 2, 4};

        System.out.println(findFirstRecurringNumber(array));
    }

    private static Integer findFirstRecurringNumber(int[] array) {
        if (array == null || array.length < 2) return -1;
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int number : array) {
            if (hashMap.get(number) == null) {
                hashMap.put(number, number);
            } else {
                return hashMap.get(number);
            }
        }
        return null;
    }
}
