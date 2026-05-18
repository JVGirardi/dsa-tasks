package StacksAndQueues.Stack.teste;

import StacksAndQueues.Stack.LinkedStack;

public class LinkedStackTeste {
    static void main() {
        testePush();
    }

    private static void testePush() {
        LinkedStack<Integer> lista = new LinkedStack<>();
        System.out.println(lista);
        System.out.println("Elemento add: "+ lista.push(1));
        System.out.println(lista);
        System.out.println("Elemento add: "+ lista.push(2));
        System.out.println(lista);
        System.out.println("Elemento add: "+ lista.push(3));
        System.out.println(lista);
        System.out.println("Elemento add: "+ lista.push(4));
        System.out.println(lista);
        System.out.println("Elemento excluido: "+ lista.pop());
        System.out.println(lista);
        System.out.println("Elemento excluido: "+ lista.pop());
        System.out.println(lista);
        System.out.println("Elemento adicionado: "+ lista.push(3));
        System.out.println(lista);
    }
}
