package LinkedLists.lista;

import java.util.Objects;

public class DoublyNo<T> {
    private DoublyNo<T> previous;
    private T element;
    private DoublyNo<T> next;

    public DoublyNo(T element, DoublyNo<T> next) {
        this.element = element;
        this.next = next;
    }

    public DoublyNo(T element) {
        this.element = element;
    }

    public DoublyNo(DoublyNo<T> previous, T element, DoublyNo<T> next) {
        this.previous = previous;
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public DoublyNo<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNo<T> previous) {
        this.previous = previous;
    }

    public DoublyNo<T> getNext() {
        return next;
    }

    public void setNext(DoublyNo<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoublyNo{" +
                "previous=" + ((previous != null) ? previous.getElement() : null) +
                ", element=" + element +
                ", next=" + ((next != null) ? next.getElement() : null) +
                '}';
    }
}
