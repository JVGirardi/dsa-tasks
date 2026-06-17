package Recursion;

public class Factorial {
    static void main() {
        System.out.println(findFactorialRecursive(2));
        System.out.println(findFactorialIterative(2));
    }

    public static int findFactorialRecursive(int number) {
        if (number == 1 || number == 0) return 1;

        return number * findFactorialRecursive(number-1);
    }

    public static int findFactorialIterative(int number) {
        if (number == 1 || number == 0) return 1;

        int sum = 1;
        while (number > 1) {
            sum = sum * number ;
            number = number-1;
        }
        return sum;
    }
}
