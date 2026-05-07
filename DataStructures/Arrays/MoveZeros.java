package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZeros {
    static void main() {
        //    nums = [0,1,0,3,12]
        //    Output: [1,3,12,0,0]
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void moveZeros(int[] nums) {
        int leftPointer = 0;
        int currentPointer = 0;
        while (currentPointer < nums.length) {
            if (nums[currentPointer] != 0) {
                int temp = nums[currentPointer];
                nums[currentPointer] = nums[leftPointer];
                nums[leftPointer] = temp;
                leftPointer++;
            }
            currentPointer++;
        }
    }
}
