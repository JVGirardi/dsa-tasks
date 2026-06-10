package Graphs.AdjancencyList;

public class Teste {
    static void main() {
        Graph graph = new Graph();

        Node zero = new Node(0);
        Node um = new Node(1);
        Node dois = new Node(2);
        Node tres = new Node(3);
        Node quatro = new Node(4);
        Node cinco = new Node(5);
        Node seis = new Node(6);


        graph.addVertex(zero);
        graph.addVertex(um);
        graph.addVertex(dois);
        graph.addVertex(tres);
        graph.addVertex(quatro);
        graph.addVertex(cinco);
        graph.addVertex(seis);

        graph.addEdge(tres, um);
        graph.addEdge(tres, quatro);
        graph.addEdge(quatro, dois);
        graph.addEdge(quatro, cinco);
        graph.addEdge(um, dois);
        graph.addEdge(um, zero);
        graph.addEdge(zero, dois);
        graph.addEdge(seis, cinco);

        System.out.println(graph.showConnections());

    }

}
