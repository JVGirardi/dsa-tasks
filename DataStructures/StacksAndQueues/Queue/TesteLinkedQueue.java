package StacksAndQueues.Queue;

public class TesteLinkedQueue {
    public static void main(String[] args) {
        testeComToString();
    }

    private static void testeComToString() {
        LinkedQueue<Integer> fila = new LinkedQueue<>();

        System.out.println("=== ESTADO INICIAL ===");
        System.out.println(fila);
        System.out.println("-------------------------------------------------");

        System.out.println("\n--- Testando Enqueue (Enfileirar) ---");
        fila.enqueue(1);
        System.out.println("Após adicionar o 1:\n" + fila);
        System.out.println("-------------------------------------------------");

        fila.enqueue(2);
        System.out.println("Após adicionar o 2:\n" + fila);
        System.out.println("-------------------------------------------------");

        fila.enqueue(3);
        System.out.println("Após adicionar o 3:\n" + fila);
        System.out.println("-------------------------------------------------");

        System.out.println("\n--- Testando Peek (Espiar o primeiro) ---");
        System.out.println("Quem está no topo? " + fila.peek());
        System.out.println("-------------------------------------------------");

        System.out.println("\n--- Testando Dequeue (Desenfileirar) ---");
        System.out.println("Removido: " + fila.dequeue());
        System.out.println("Status após primeira remoção:\n" + fila);
        System.out.println("-------------------------------------------------");

        System.out.println("Removido: " + fila.dequeue());
        System.out.println("Status após segunda remoção:\n" + fila);
        System.out.println("-------------------------------------------------");

        System.out.println("\n--- Esvaziando a fila completamente ---");
        System.out.println("Removido: " + fila.dequeue()); // Removendo o último elemento (3)
        System.out.println("Status após esvaziar:\n" + fila);
        System.out.println("-------------------------------------------------");

        System.out.println("\n--- Adicionando em uma fila que foi esvaziada ---");
        fila.enqueue(99);
        System.out.println("Após adicionar o 99:\n" + fila);
        System.out.println("-------------------------------------------------");
    }
}
