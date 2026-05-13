package ArraysExercises;

public class MyArray {
    private int[] array;
    private int tamanho;
    private int capacidade;

    public MyArray(int capacidadeInicial) {
        this.capacidade = capacidadeInicial;
        this.array = new int[capacidade];
        this.tamanho = 0;
    }

    public void adicionarElemento(int elemento) {

        if (tamanho == capacidade) {
            aumentarCapacidade();
        }
        array[tamanho] = elemento;
        tamanho++;
    }

    public void aumentarCapacidade() {
        capacidade = capacidade * 2;
        int[] novoArray = new int[capacidade];
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }
        this.array = novoArray;
        System.out.println("Capacidade aumentada para: " + capacidade);
    }

    public int obter(int index) {
        if (indexExiste(index)) {
            return array[index];
        }
        throw new IndexOutOfBoundsException();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void remover(int index) {
        if (indexExiste(index)) {
            for (int i = index; i < tamanho - 1; i++) {
                array[index] = array[index +1];
            }

            array[tamanho-1] = 0;
            tamanho--;
        }
    }

    private boolean indexExiste(int index) {
        return (index >= 0 && index <= tamanho);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i= 0; i < tamanho-1; i++) {
            sb.append(array[i]);
            if (i < tamanho-1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }






}
