package LinkedLists.lista;

import java.util.Comparator;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    private final String INVALID_POSITION = "Invalid position";
    private final String POSITION_NOT_FOUND = "Position not Found";
    private final String EMPTY_LIST = "The list is empty";
    private final int NOT_FOUNDED = -1;

    public void adiciona(T elemento) {
        No<T> no = new No<T>(elemento);
        if (this.tamanho < 1) {
            this.inicio = no;
        } else {
            this.ultimo.setProximo(no);
        }
        this.ultimo = no;
        this.tamanho++;
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adiciona(T elemento, int posicao) {
        if (posicaoNaoValida(posicao)) {
            throw new IllegalArgumentException(INVALID_POSITION);
        }

        if (posicao == 0) {
            adicionaInicio(elemento);
        } else if (posicao == tamanho){
            adiciona(elemento);
        } else {
            No<T> noAnterior = buscaPorNo(posicao-1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T removeInicio() {
        if (this.tamanho <= 0) {
            throw new RuntimeException(EMPTY_LIST);
        }

        No<T> remover = this.inicio;
        this.inicio = remover.getProximo();
        this.tamanho--;
        if (this.tamanho == 0) {
            this.ultimo = null;
//            this.inicio = null; --> nao eh necessario, ja vai estar apontando para null
        }

        return remover.getElemento();
    }

    public T removeFinal() {
        if (this.tamanho <= 0) {
            throw new RuntimeException(EMPTY_LIST);
        }
        if (this.tamanho == 1) {
            return removeInicio();
        }

        No<T> penultimoNo = buscaPorNo(this.tamanho-2);
        T elementoRemovido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        tamanho--;
        return elementoRemovido;
    }

    public T remove(int pos) {
        if (posicaoNaoValida(pos)) {
            throw new IllegalArgumentException(INVALID_POSITION);
        }
        if (pos == 0) {
            return removeInicio();
        }
        if (pos == this.tamanho-1) {
            return removeFinal();
        }

        No<T> noAnterior = buscaPorNo(pos-1);
        No<T> noRemovido = noAnterior.getProximo();
        No<T> proximo = noRemovido.getProximo();
        noAnterior.setProximo(proximo);
        noRemovido.setProximo(null);
        this.tamanho--;
        return noRemovido.getElemento();

    }

    public int getTamanho() {
        return tamanho;
    }

    public void limpaLista() {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaPorNo(int posicao) {
        if (posicaoNaoValida(posicao)) {
            throw new IllegalArgumentException(POSITION_NOT_FOUND);
        }
        No<T> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    private boolean posicaoNaoValida(int posicao) {
        return posicao >= this.tamanho || posicao < 0;
    }

    public T buscaPorPosicao(int posicao) {
        return buscaPorNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        No<T> atual = this.inicio;
        int pos = 0;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) return pos;
            atual = atual.getProximo();
            pos++;
        }
        return NOT_FOUNDED;
    }

    public void adicionaOrdenado(T elemento, Comparator<T> comparator) {
        if (this.tamanho == 0) {
            adicionaInicio(elemento);
        } else if (comparator.compare(this.inicio.getElemento(), elemento) >= 0) {
            adicionaInicio(elemento);
        } else if (comparator.compare(this.ultimo.getElemento(), elemento) <= 0) {
            adiciona(elemento);
        } else {
            No<T> atual = this.inicio;
            while (atual.getProximo() != null && comparator.compare(atual.getProximo().getElemento(), elemento) < 0) { //while 1st>=2nd
                atual = atual.getProximo();
            }
            No<T> celula = new No<T>(elemento, atual.getProximo());
            atual.setProximo(celula);
            tamanho++;

        }
    }

    public void inverterLista() {
        No<T> anterior = null;
        No<T> atual = this.inicio;
        No<T> proximo = null;
       while (atual != null) {
           proximo = atual.getProximo();
           atual.setProximo(anterior);

           anterior = atual;
           atual = proximo;
       }
       this.inicio = anterior;
    }

    public Object[] converterParaArray() {
        if (this.tamanho == 0) {
            return (T[]) new Object[0];
        }
        Object[] vetor = new Object[this.tamanho];
        No<T> atual = this.inicio;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = atual.getElemento();
            atual = atual.getProximo();
        }
        return vetor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.tamanho == 0) {
            return sb.append("[]").toString();
        }

        sb.append("[");
        No<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(atual.getElemento());
            sb.append(", ");
            atual = atual.getProximo();
        }
        sb.append(atual.getElemento());


//        sb.append(atual.getElemento());
//        while (atual.getProximo() != null) {
//            sb.append(", ");
//            atual = atual.getProximo();
//            sb.append(atual.getElemento());
//        }

        sb.append("]");
        return sb.toString();
    }
}
