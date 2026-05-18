package ArraysExercises.HandmandeLista;

public class Teste {

    // Ponto de entrada do programa
    public static void main(String[] args) {
        testeAdicionar();
        testeAdicionarNaPosicao();
        testeBuscarPorIndice();
        testeBuscarEContem();
        testeRemover();
        testeLimpar();
    }

    /**
     * Testa a adição sequencial e o aumento automático de capacidade.
     */
    private static void testeAdicionar() {
        System.out.println("--- Teste: Adicionar e Dobrar Capacidade ---");
        Vetor<Integer> vetor = new Vetor<>(5); // Começa com 5

        // Adicionando 10 itens para forçar o vetor a dobrar de tamanho
        for(int i = 1; i <= 10; i++) {
            vetor.adiciona(i);
        }

        System.out.println("Esperado: Vetor com 10 itens e capacidade maior que 5.");
        System.out.println("Resultado: " + vetor);
    }

    /**
     * Testa a inserção de um elemento no meio do vetor (deslocamento para a direita).
     */
    private static void testeAdicionarNaPosicao() {
        System.out.println("\n--- Teste: Adicionar na Posição Específica ---");
        Vetor<String> vetor = new Vetor<>(5);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("D");

        // Inserindo a letra 'C' no índice 2 (entre o B e o D)
        vetor.adiciona("C", 2);

        System.out.println("Esperado: [A, B, C, D]");
        System.out.println("Resultado: " + vetor);
    }

    /**
     * Testa a recuperação de um dado baseado na sua posição.
     */
    private static void testeBuscarPorIndice() {
        System.out.println("\n--- Teste: Buscar por Índice ---");
        Vetor<String> vetor = new Vetor<>(5);
        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("C++");

        String linguagem = vetor.buscar(1);

        System.out.println("Esperado: Python");
        System.out.println("Resultado: " + linguagem);
    }

    /**
     * Testa se o vetor consegue encontrar um elemento específico e validar sua existência.
     */
    private static void testeBuscarEContem() {
        System.out.println("\n--- Teste: Busca Sequencial e Contém ---");
        Vetor<Double> vetor = new Vetor<>(5);
        vetor.adiciona(10.5);
        vetor.adiciona(20.0);
        vetor.adiciona(35.5);

        int indice = vetor.busca(20.0);
        boolean possui = vetor.contem(50.0);

        System.out.println("Esperado: Índice do 20.0 é 1 | Contém 50.0? false");
        System.out.println("Resultado: Índice do 20.0 é " + indice + " | Contém 50.0? " + possui);
    }

    /**
     * Testa a remoção de um elemento e o deslocamento de dados para a esquerda.
     */
    private static void testeRemover() {
        System.out.println("\n--- Teste: Remover Elemento ---");
        Vetor<String> vetor = new Vetor<>(5);
        vetor.adiciona("Maçã");
        vetor.adiciona("Banana"); // Índice 1
        vetor.adiciona("Laranja");

        String removida = vetor.remover(1);

        System.out.println("Esperado: Removida: Banana | Sobraram: [Maçã, Laranja] Tamanho: 2");
        System.out.println("Resultado: Removida: " + removida);
        System.out.println("Status Atual: " + vetor);
    }

    /**
     * Testa a limpeza completa da estrutura e a redefinição do tamanho lógico.
     */
    private static void testeLimpar() {
        System.out.println("\n--- Teste: Limpar Vetor ---");
        Vetor<String> vetor = new Vetor<>(5);
        vetor.adiciona("Um");
        vetor.adiciona("Dois");
        vetor.adiciona("Três");

        vetor.limpar();

        System.out.println("Esperado: Vetor vazio [] com Tamanho: 0");
        System.out.println("Resultado: " + vetor);
    }
}