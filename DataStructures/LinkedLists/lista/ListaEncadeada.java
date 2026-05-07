package LinkedLists.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    private final int NAO_ENCONTRADO = -1;

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
        if (posicao > tamanho || posicao < 0) {
            throw new IllegalArgumentException("Position not Found.");
        }
        No<T> atual = this.inicio;
        int i=0;
        while (i < posicao) {
            atual = atual.getProximo();
            i++;
        }
        return atual;
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
        return NAO_ENCONTRADO;
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
