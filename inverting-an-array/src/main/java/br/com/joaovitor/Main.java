package br.com.joaovitor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Criar um programa em Java que inverta a ordem dos elementos de um array unidimensional (vetor) de inteiros.
        Requisitos:
        Não criar um segundo array para armazenar os elementos invertidos. A inversão deve ser
        feita diretamente no array original (técnica in-place).
        */

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        inverter(array);
        System.out.println(Arrays.toString(array));


        }
    private static void inverter(int[] array) {
        if (array == null) return;
        int left = 0;
        int right = array.length -1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

}
