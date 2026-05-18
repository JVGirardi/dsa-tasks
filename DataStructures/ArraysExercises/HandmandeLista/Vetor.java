package ArraysExercises.HandmandeLista;

public class Vetor<T> {
    private T[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade];
    }

    public Vetor() {
        this(10);
    }

    public boolean adiciona(T elemento) {
        if (isCapacidadeMenorTamanho()) {
            dobrarTamanhoArray();
        }
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;

        return true;
    }

    public boolean adiciona(T elemento, int index) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("INDEX INVÁLIDO");
        }
        if (isCapacidadeMenorTamanho()) {
            dobrarTamanhoArray();
        }
        if (index == this.tamanho) {
            return adiciona(elemento);
        }

        for (int i = tamanho-1; i >= index; i--) {
            elementos[i+1] = elementos[i];
        }
        elementos[index] = elemento;
        tamanho++;

        return true;
    }

    public int busca(T elemento) {
        for (int i=0; i< tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        return busca(elemento) >= 0;
    }

    public void limpar() {
        for (int i=0; i< elementos.length; i++) {
            elementos[i] = null;
        }
        this.tamanho=0;
    }

    public T buscar(int indice) {
        if (!isIndiceValido(indice)) {
            throw new IndexOutOfBoundsException("INDEX INVÁLIDO");
        }

        return elementos[indice];
    }

    public T remover(int indice) {
        if (!isIndiceValido(indice)) {
            throw new IndexOutOfBoundsException("INDEX INVÁLIDO");
        }
        T elementoRemovido = elementos[indice];
        for (int i= indice; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;

        return elementoRemovido;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    private boolean isIndiceValido(int indice) {
        return indice >= 0 && indice < this.tamanho;
    }

    private boolean isCapacidadeMenorTamanho() {
        return this.capacidade <= this.tamanho;
    }

    private void dobrarTamanhoArray() {
        T[] arrayAntigo = this.elementos;
        int novaCapacidade = this.capacidade*2;

        if (novaCapacidade == 0) {
            novaCapacidade = 1;
        }

        T[] arrayNovo = (T[]) new Object[novaCapacidade];
        for (int i=0; i < arrayAntigo.length; i++) {
            arrayNovo[i] = arrayAntigo[i];
        }
        this.capacidade = novaCapacidade;
        this.elementos = arrayNovo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i= 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i != tamanho-1) {
                sb.append(", ");
            }
        }
        sb.append("]\n");
        sb.append("Tamanho: " + this.tamanho + "\n");
        sb.append("Capacidade: "+ this.capacidade + "\n");

        return sb.toString();
    }
}
