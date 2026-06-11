package Graphs.AdjancencyList;

import java.util.Objects;

public class Node {
    private Integer number;

    public Node(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(number, node.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public String toString() {
        return number.toString();
    }



}
