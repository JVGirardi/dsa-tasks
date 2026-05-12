package LinkedLists.lista.teste;

import LinkedLists.lista.ListaEncadeada;

import java.util.Comparator;

public class ListaEncadeadaTeste {
    static void main() {
//        testesIniciais();
//        adicionaNoInicio();
//        adicionaPorPosicao();
//        removeDoInicio();
//        removeDoFinal();
//        removePosicao();
        insereOrdenado();
    }

    private static void insereOrdenado() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        Comparator<Integer> crescente = Integer::compareTo;
        Comparator<Integer> decrescente = (s1, s2) -> s2.compareTo(s1);

        lista.adicionaOrdenado(5, decrescente);
        System.out.println(lista);
        lista.adicionaOrdenado(1, decrescente);
        System.out.println(lista);
        lista.adicionaOrdenado(4, decrescente);
        System.out.println(lista);
        lista.adicionaOrdenado(2, decrescente);
        System.out.println(lista);
        lista.adicionaOrdenado(3, decrescente);
        System.out.println(lista);
        lista.adicionaOrdenado(6, decrescente);
        System.out.println(lista);
        lista.adicionaOrdenado(5, decrescente);
        System.out.println(lista);
    }


    private static void removePosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.remove(2));
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.remove(0));
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.remove(1));
        System.out.println("Lista: " + lista);


    }

    public static void removeDoFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);
    }


    public static void removeDoInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

//        lista.removeInicio();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);


    }

    public static void adicionaNoInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);

    }

    public static void adicionaPorPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

//        lista.adiciona(-1, 1);
        lista.adiciona(1);
        lista.adiciona(2);

//        lista.adiciona(0, 5);
        lista.adiciona(4); //1, 2, 4
        lista.adiciona(0, 0); //0, 1, 2, 4
        lista.adiciona(5, 4); //0, 1, 2, 4, 5
        lista.adiciona(3, 2); //0, 1, 3, 2, 4, 5

        System.out.println(lista);
    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        // lista.limpa();
        // System.out.println(lista);

        // busca por elemento
        System.out.println("******* busca por elemento ");
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));

        // busca por posição
        System.out.println("******* busca por posição ");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        // System.out.println(lista.buscaPorPosicao(-1));
        // System.out.println(lista.buscaPorPosicao(4));
    }
}
