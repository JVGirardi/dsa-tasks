package Recursion;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.sum;

public class Fibonacci {
    static void main() {
        System.out.println(fibonacciIterative(6));
        System.out.println(fibonacciRecursive(6));
        System.out.println(fibIterativeWithArray(6));
    }

    public static int fibonacciIterative(int n) {
        if (n == 0) return 0;

        int primeiro = 0;
        int segundo = 1;
        int total = 1;
        int indexAtual = 1;
        while (indexAtual < n) {
            total = sum(primeiro, segundo);
            primeiro = segundo;
            segundo = total;

            indexAtual++;
        }

        return total;
    }

    public static int fibIterativeWithArray(int n) {
        ArrayList<Integer> array = new ArrayList<>(List.of(0 , 1));
        for (int i = 1; i < n; i++) {
            int nextValue = sum(array.get(i), array.get(i-1));
            array.add(nextValue);
        }

        return array.get(n);
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1 ) return n;
        //o(2^n) --> exponential time
        return Integer.sum(fibonacciRecursive(n-2), fibonacciRecursive(n-1));
    }
}
