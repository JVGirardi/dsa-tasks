package StacksAndQueues.Stack.teste;

import StacksAndQueues.Stack.ArrayStack;

public class ArrayStackTeste {

    public static void main(String[] args) {
        testePushEPop();
    }

    private static void testePushEPop() {
        ArrayStack<Integer> pilha = new ArrayStack<>();

        System.out.println("Estado inicial: " + pilha);

        System.out.println("Elemento add: " + pilha.push(1));
        System.out.println(pilha);

        System.out.println("Elemento add: " + pilha.push(2));
        System.out.println(pilha);

        System.out.println("Elemento add: " + pilha.push(3));
        System.out.println(pilha);

        System.out.println("Elemento add: " + pilha.push(4));
        System.out.println(pilha);

        System.out.println("Elemento excluido: " + pilha.pop());
        System.out.println(pilha);

        System.out.println("Elemento excluido: " + pilha.pop());
        System.out.println(pilha);

        System.out.println("Elemento adicionado: " + pilha.push(3));
        System.out.println(pilha);

        System.out.println("Elemento no topo (peek): " + pilha.peek());
        System.out.println("Estado final: " + pilha);
    }
}