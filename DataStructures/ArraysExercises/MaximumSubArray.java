package ArraysExercises;

public class MaximumSubArray {
    //Given an integer array nums, find the subarray with the largest sum, and return its sum.
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    static void main() {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(largestSum(array));
    }

    private static int largestSum(int[] array) {
        int largestSum = array[0];
        int currentSum = array[0];
        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            currentSum = Math.max(currentNumber, currentNumber+currentSum);
            largestSum = Math.max(largestSum, currentSum);
        }
        return largestSum;
    }
}
