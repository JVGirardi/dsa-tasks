package LinkedLists.lista.teste;

import LinkedLists.lista.DoublyListaEncadeada;

import java.util.Arrays;

public class DoublyListaEncadeadaTeste {
    static void main() {
//        testeAdicionarInicio();
//        testeAdicionarFinal();
//        testeRemoverPrimeiroElemento();
//        testeRemoverUltimoElemento();
//        testePrintBackwardForward();
//        testeProcurandoPorElementoComIndice();
//        testeInserindoNoEmPosicao();
//        testeRemoverEmPosicao();
//        testeRetornaIndexElemento();
//        testeListaClear();
//        testeListaRemoveElemento();
//        testeToArray();
//        testeReverter();
        testeRetornarElementoMeio();
    }

    private static void testeRetornarElementoMeio() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(3);
        lista.adicionarFinal(6);
        System.out.println(lista);
        System.out.println(lista.getElementoDoMeio());

    }

    private static void testeReverter() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(3);
        lista.adicionarFinal(6);
        System.out.println(lista);
        lista.inverterLinkedList();
        System.out.println(lista);
    }

    private static void testeToArray() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(3);
        lista.adicionarFinal(6);

        Object[] array = (Object[]) lista.converterParaArray();
        System.out.println(Arrays.toString(array));
    }

    private static void testeListaRemoveElemento() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(3);
        lista.adicionarFinal(6);
        System.out.println(lista);
        System.out.println(lista.removeElemento(3));
        System.out.println(lista);
    }

    private static void testeListaClear() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(5);
        lista.adicionarFinal(6);
        lista.adicionarFinal(7);
        System.out.println(lista);
        lista.limpezaProfunda();
        System.out.println(lista);

    }

    private static void testeRetornaIndexElemento() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        System.out.println(lista);
        System.out.println(lista.retornaIndexElemento(2));
    }

    private static void testeRemoverEmPosicao() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(5);
        lista.adicionarFinal(6);
        lista.adicionarFinal(7);
        System.out.println(lista);
        lista.removerNaPosicao(3);
        System.out.println(lista);

    }

    private static void testeInserindoNoEmPosicao() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(5);
        lista.adicionarFinal(6);
        lista.adicionarFinal(7);
        System.out.println(lista);
        lista.inserirNaPosicao(4, 3);
        System.out.println(lista);
    }

    private static void testeProcurandoPorElementoComIndice() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(5);
        lista.adicionarFinal(6);
        lista.adicionarFinal(7);

        System.out.println(lista.getElement(7));
    }

    private static void testePrintBackwardForward() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarInicio(1);
        lista.adicionarInicio(2);
        lista.adicionarInicio(3);
        lista.adicionarInicio(4);
        lista.adicionarInicio(5);
        lista.adicionarInicio(6);

        System.out.println(lista.printBackward());
        System.out.println(lista.printForward());
    }


    private static void testeRemoverUltimoElemento() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        System.out.println(lista);
        lista.adicionarInicio(1);
        System.out.println(lista);
        System.out.println("Elemento removido: "+lista.removerUltimo());
        System.out.println(lista);
        lista.adicionarInicio(3);
        lista.adicionarInicio(5);
        System.out.println(lista);
        System.out.println("Elemento removido: "+lista.removerUltimo());
        System.out.println(lista);
        System.out.println("Elemento removido: "+lista.removerUltimo());
        System.out.println(lista);
    }

    private static void testeRemoverPrimeiroElemento() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        System.out.println(lista);
        lista.adicionarInicio(1);
        System.out.println(lista);
        System.out.println("Elemento removido: "+lista.removerPrimeiro());
        System.out.println(lista);
        lista.adicionarInicio(3);
        lista.adicionarInicio(5);
        System.out.println(lista);
        System.out.println("Elemento removido: "+lista.removerPrimeiro());
        System.out.println(lista);
        System.out.println("Elemento removido: "+lista.removerPrimeiro());
        System.out.println(lista);
    }

    public static void testeAdicionarFinal() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarFinal(1);
        System.out.println(lista);
        lista.adicionarFinal(2);
        System.out.println(lista);
        lista.adicionarFinal(3);
        System.out.println(lista);
    }

    public static void testeAdicionarInicio() {
        DoublyListaEncadeada<Integer> lista = new DoublyListaEncadeada<>();
        lista.adicionarInicio(1);
        System.out.println(lista);
        lista.adicionarInicio(2);
        System.out.println(lista);
        lista.adicionarInicio(3);
        System.out.println(lista);
    }
}
