package Graphs.AdjancencyList;

public class Node {
    private Integer number;

    public Node(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
