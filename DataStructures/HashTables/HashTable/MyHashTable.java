package HashTables.HashTable;


public class MyHashTable <K, V> {
    private HashNode<K, V>[] items;
    private int quantidade;
    private int capacidade;

    public MyHashTable(int capacidade) {
        items = (HashNode<K, V>[]) new HashNode[capacidade];
        this.capacidade = capacidade;
    }

    public MyHashTable() {
        this(10);
    }

    public void adicionar(K key, V value) {
        if (isNecessarioAumentarCapacidade()) {
            aumentar();
        }
        HashNode<K, V> newHashNode = new HashNode<>(key, value);
        HashNode<K, V> currentHashNode = items[getPosicaoDeAdicao(key)];
        if (currentHashNode == null) {
            currentHashNode = newHashNode;
        } else {
            while (currentHashNode.getNext() != null) {
                currentHashNode = currentHashNode.getNext();
            }
            currentHashNode.setNext(newHashNode);
        }


    }

    private boolean isNecessarioAumentarCapacidade() {
        return this.quantidade >= Math.abs(capacidade*0.75);
    }

    private void aumentar() {
        int novaCapacidade = this.capacidade*2;
        if (novaCapacidade == 0) {
            novaCapacidade = 1;
        }

        HashNode<K, V>[] novaHashList = new HashNode[novaCapacidade];
        for (int i = 0; i < quantidade; i++) {
            novaHashList[i] = items[i];
        }
        this.items = novaHashList;
    }

    private int getPosicaoDeAdicao(K key) {
        return Math.abs((hashCode(key)%capacidade));
    }

    private int hashCode(K key) {
        return key.hashCode();
    }



}
