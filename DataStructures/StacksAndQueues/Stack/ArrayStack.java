package StacksAndQueues.Stack;

public class ArrayStack<T> {
    private T[] elementos;
    private int capacidade;
    private int tamanho;

    public ArrayStack() {
        elementos = (T[]) new Object[10];
        this.capacidade = 10;
    }

    private void aumentaCapacidade() {
        int novaCapacidade = this.capacidade*2;

        if (novaCapacidade == 0) {
            novaCapacidade = 1;
        }
        T[] novoArray = (T[]) new Object[novaCapacidade];
        for (int i= 0; i < tamanho; i++) {
            novoArray[i] = this.elementos[i];
        }

        this.elementos = novoArray;
        this.capacidade = novaCapacidade;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean push(T elemento) {
        if (this.tamanho >= this.capacidade) {
            aumentaCapacidade();
        }

        this.elementos[tamanho] = elemento;
        tamanho++;

        return true;
    }

    public T peek() {
        if (this.tamanho == 0) {
            throw new IndexOutOfBoundsException();
        }

        return elementos[tamanho-1];
    }

    public T pop() {
        if (this.tamanho == 0) {
            throw new IndexOutOfBoundsException();
        }
        T elementoRemover = elementos[tamanho-1];
        elementos[tamanho-1] = null;
        tamanho--;

        return elementoRemover;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.elementos[i]);
            if (i < this.tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
