package StacksAndQueues.Queue;

import StacksAndQueues.Node;

//FIFO
public class LinkedQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        return first.getElement();
    }

    public T enqueue(T value) {
        Node<T> novoNo = new Node<>(value);
        novoNo.setNext(this.first);
        this.first = novoNo;
        if (isEmpty()) {
            this.last = novoNo;
        }
        size++;

        return first.getElement();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> remover = this.first;
        this.first = this.first.getNext();
        size--;
        if (this.size == 0) {
            this.last = null;
        }

        return remover.getElement();
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> atual = this.first;
        while (atual != null) {
            sb.append(atual.getElement());
            atual = atual.getNext();
            if (atual != null) {
                sb.append(", ");
            }
        }

        sb.append("]");
        sb.append("\nFirst: " + ((this.first != null) ? this.first.getElement() : null));
        sb.append("\nLast: " + ((this.last != null) ? this.last.getElement() : null));
        sb.append("\nSize: " + this.size);

        return sb.toString();
    }
}
