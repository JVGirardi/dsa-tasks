package Graphs.AdjancencyList;

import java.util.*;

public class Graph {
    private int numberOfNodes = 0;
    private Map<Node, LinkedList> adjacentList;

    public Graph() {
        this.adjacentList = new HashMap<>();
    }

    public void addVertex(Node node) {
        LinkedList<Node> newLinkedList = new LinkedList<Node>();
        this.adjacentList.put(node, newLinkedList);
        numberOfNodes++;
    }

    //create a conection
    public void addEdge(Node node1 ,Node node2) {
        LinkedList<Node> llNode1 = this.adjacentList.get(node1);
        LinkedList<Node> llNode2 = this.adjacentList.get(node2);

        if (llNode1 != null && llNode2 != null) {
            if (!llNode1.contains(node2)) {
                llNode1.addLast(node2);
            }
            if (!llNode2.contains(node1)) {
                llNode2.addLast(node1);
            }
        }
    }

    public String showConnections() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Node, LinkedList> entry : adjacentList.entrySet()) {
            sb.append(entry.getKey() + "-->");
            if (entry.getValue() != null) {
                sb.append(" ");
                entry.getValue().forEach(valor -> sb.append(valor));
            }
        }

        return sb.toString();
    }
    //undirected graph
}
