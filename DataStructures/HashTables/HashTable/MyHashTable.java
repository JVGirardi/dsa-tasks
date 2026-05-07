package HashTables.HashTable;

import java.util.ArrayList;

public class MyHashTable <K, V> {
    private ArrayList<HashNode<K, V>> buckets;
    private int capacity;
    private int length;

    public MyHashTable() {
        this.capacity = 10;
        this.length = 0;
        this.buckets = new ArrayList<>(capacity);

        for (int i = 0; i< capacity; i++) {
            buckets.add(null);
        }
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        HashNode<K, V> listBegin = buckets.get(index);

        HashNode<K, V> current = listBegin;
        while (current != null) {
            if (current.getKey().equals(key)) {

            }
        }

    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % capacity);
    }

}
