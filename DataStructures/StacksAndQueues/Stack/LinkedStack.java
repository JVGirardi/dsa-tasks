package StacksAndQueues.Stack;

import StacksAndQueues.Node;

public class LinkedStack<T> {
    private Node<T> top;
    private Node<T> bottom;
    private int size;

    private final String EMPTY_LIST = "Lista vazia";

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException(EMPTY_LIST);
        }

        return this.top.getElement();
    }

    public T push(T element) {
        Node<T> no = new Node<>(element);
        if (size == 0) {
            this.bottom = no;
        }

        no.setNext(this.top);
        this.top = no;
        size++;

        return element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException(EMPTY_LIST);
        }
        if (size == 1) {
            this.bottom = null;
        }
        Node<T> noExcluir = this.top;

        this.top = noExcluir.getNext();
        noExcluir.setNext(null);
        size--;

        return noExcluir.getElement();
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> atual = this.top;
        while (atual != null) {
            sb.append(atual.getElement());
            atual = atual.getNext();
            if (atual != null) {
                sb.append(", ");
            }
        }
        sb.append("]\n");
        sb.append("Bottom: " + ((this.bottom != null) ? this.bottom.getElement() : null) +"\n");
        sb.append("Top: " + ((this.top != null) ? this.top.getElement() : null) + "\n");
        sb.append("Size: " + this.size + "\n") ;
        sb.append("isEmpty: " + this.isEmpty());
        return sb.toString();
    }
}
