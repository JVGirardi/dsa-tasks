package LinkedLists.lista;

import java.util.Iterator;

public class DoublyListaEncadeada<T> implements Iterable<T>{
    private DoublyNo<T> head;
    private DoublyNo<T> tail;
    private int size;

    private final String EMPTY_LIST = "Lista vazia";
    private final String INDEX_OUT_OF_BOUNDS = "Index out of bounds";

    public T adicionarInicio(T elemento) {
        DoublyNo<T> novoNo = new DoublyNo<>(elemento);
        DoublyNo<T> previousHead = this.head;

        if (this.size == 0) {
            this.tail = novoNo;
        } else {
            previousHead.setPrevious(novoNo);
            novoNo.setNext(previousHead);
        }

        this.head = novoNo;
        size++;

        return novoNo.getElement();
    }

    public T adicionarFinal(T elemento) {
        if (this.size == 0) {
            return adicionarInicio(elemento);
        }
        DoublyNo<T> newNo = new DoublyNo<>(elemento);
        DoublyNo<T> previousTail = this.tail;

        newNo.setPrevious(previousTail);
        previousTail.setNext(newNo);
        this.tail = newNo;
        size++;

        return newNo.getElement();
    }

    public T removerPrimeiro() {
        if (this.size == 0) {
            throw new RuntimeException(EMPTY_LIST);
        }
        if (this.size == 1) {
            T elemento = this.head.getElement();
            this.tail = null;
            this.head = null;
            size--;
            return elemento;
        }

        T elementExcluded = this.head.getElement();
        DoublyNo<T> nextHead = this.head.getNext();

        nextHead.setPrevious(null);
        this.head = nextHead;
        size--;

        return elementExcluded;
    }

    public T removerUltimo() {
        if (this.size == 0) {
            throw new RuntimeException(EMPTY_LIST);
        }
        if (this.size == 1) {
            return removerPrimeiro();
        }
        DoublyNo<T> tail = this.tail;
        DoublyNo<T> newTail = tail.getPrevious();
        newTail.setNext(null);
        this.tail = newTail;
        size--;

        return tail.getElement();
    }

    public String printForward() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        DoublyNo<T> atual = this.head;
        while (atual != null) {
            sb.append(atual.getElement());
            atual = atual.getNext();
            if (atual != null) {
                sb.append(", ");
            }
        }
        sb.append("]\n");

        return sb.toString();
    }

    public String printBackward() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        DoublyNo<T> atual = this.tail;
        while (atual != null) {
            sb.append(atual.getElement());
            atual = atual.getPrevious();
            if (atual != null) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    public T getElement(int index) {
        DoublyNo<T> node = getNode(index);

        return node.getElement();
    }

    private DoublyNo<T> getNode(int index) {
        if (!isIndexValid(index)) {
            throw new IndexOutOfBoundsException(INDEX_OUT_OF_BOUNDS);
        }
        DoublyNo<T> currentNode = (index < (size/2)) ? this.head : this.tail;

        if (currentNode == this.head) {
            for (int i=0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
        }
        if (currentNode == this.tail) {
            for (int i=this.size; index < i -1; i--) {
                currentNode = currentNode.getPrevious();
            }
        }

        return currentNode;
    }

    public T inserirNaPosicao(T element, int pos) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException(INDEX_OUT_OF_BOUNDS);
        }
        if (pos == 0) {
            return adicionarInicio(element);
        }
        if (pos >= size) {
            return adicionarFinal(element);
        }
        DoublyNo<T> previousNode = getNode(pos-1);
        DoublyNo<T> newNode = new DoublyNo<>(element);
        DoublyNo<T> nextNode = previousNode.getNext();

        previousNode.setNext(newNode);
        nextNode.setPrevious(newNode);
        newNode.setPrevious(previousNode);
        newNode.setNext(nextNode);
        size++;

        return newNode.getElement();
    }

    public T removerNaPosicao(int index) {
        if (!isIndexValid(index)) {
            throw new IndexOutOfBoundsException(INDEX_OUT_OF_BOUNDS);
        }
        if (index == 0) {
            return removerPrimeiro();
        }
        if (index == size-1) {
            return removerUltimo();
        }
        DoublyNo<T> nodeToRemove = getNode(index);
        T elementRemoved = nodeToRemove.getElement();
        DoublyNo<T> previous = nodeToRemove.getPrevious();
        DoublyNo<T> next = nodeToRemove.getNext();
        previous.setNext(next);
        next.setPrevious(previous);

        nodeToRemove.setPrevious(null);
        nodeToRemove.setNext(null);
        nodeToRemove.setElement(null);
        size--;

        return elementRemoved;
    }

    public T removeElemento(T element) {
        int index = retornaIndexElemento(element);
        if (index != -1) {
            return removerNaPosicao(index);
        }

        return null;
    }

    public int retornaIndexElemento(T element) {
        DoublyNo<T> left = this.head;
        int leftIndex=0;

        while (leftIndex < this.size) {
            if (left.getElement().equals(element)) return leftIndex;
            left = left.getNext();
            leftIndex++;
        }

        return -1;
    }

    public void limpezaProfunda() {
        DoublyNo<T> atual = this.head;

        while (atual != null) {
            DoublyNo<T> next = atual.getNext();
            atual.setPrevious(null);
            atual.setElement(null);
            atual.setNext(null);
            atual = next;
        }
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Object[] converterParaArray() {
        Object[] array = new Object[size];
        DoublyNo<T> atual = this.head;
        for (int i=0; i < array.length; i++) {
            array[i] = atual.getElement();
            atual = atual.getNext();
        }

        return array;
    }

    public void inverterLinkedList() {
        if (this.size <= 1) {
            return;
        }
        DoublyNo<T> previous = null;
        DoublyNo<T> atual = this.head;
        DoublyNo<T> next = null;

        while (atual != null) {
            next = atual.getNext();
            atual.setPrevious(next);
            atual.setNext(previous);

            previous = atual;
            atual = next;
        }
        this.tail = this.head;
        this.head = previous;
    }

    public T getElementoDoMeio() {
        if (this.head == null) {
            throw new RuntimeException(EMPTY_LIST);
        }

        DoublyNo<T> ponteiroLento = this.head;
        DoublyNo<T> ponteiroRapido = this.head;

        while (ponteiroRapido != null && ponteiroRapido.getNext() != null) {
            ponteiroLento = ponteiroLento.getNext();
            ponteiroRapido = ponteiroRapido.getNext().getNext();
        }

        return ponteiroLento.getElement();
    }

    private boolean isIndexValid(int index) {
        return index >= 0 && index <= size - 1;
    }

    public int getSize() {
        return size;
    }

    public DoublyNo<T> getTail() {
        return tail;
    }

    public DoublyNo<T> getHead() {
        return head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        DoublyNo<T> atual = this.head;
        while (atual != null) {
            sb.append(atual.getElement());
            atual = atual.getNext();
            if (atual != null) {
                sb.append(", ");
            }
        }
        sb.append("]\n");
        sb.append("Size: "+getSize()+"\n");
        sb.append("Head: "+((getHead() != null) ? getHead().getElement() : null)+"\n");
        sb.append("Tail: "+((getTail() != null) ? getTail().getElement() : null)+"\n");

        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator();
    }

    private class ListaIterator implements Iterator<T> {
        DoublyNo<T> atual = head;

        @Override
        public boolean hasNext() {
            return atual != null;
        }

        @Override
        public T next() {
            T valor = atual.getElement();
            atual = atual.getNext();
            return valor;
        }
    }
}
