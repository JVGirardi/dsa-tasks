package Trees.BinarySearchTree;

public class BinarySearchTree {
    private BinaryTreeNode mainNode;

    public BinarySearchTree() {
    }

    public BinaryTreeNode lookup(Integer element) {
        if (element == null) {
            throw new RuntimeException("Forbidden search null value");
        }
        BinaryTreeNode noAtual = this.mainNode;
        while (noAtual != null) {
            Integer elementoNoAtual = noAtual.getElement();
            if (elementoNoAtual.equals(element)) {
                return noAtual;
            } else if (element > elementoNoAtual) {
                noAtual = noAtual.getRight();
            } else {
                noAtual = noAtual.getLeft();
            }
        }
        return null;
    }

    public void insert(Integer element) {
        if (element == null) {
            throw new RuntimeException("Proibido inserir null");
        }
        BinaryTreeNode novoNo = new BinaryTreeNode(element);
        if (this.mainNode == null) {
            this.mainNode = novoNo;
            return;
        }
        BinaryTreeNode currentNode = this.mainNode;
        while (true) {
            Integer valorNoAtual = currentNode.getElement();
            if (element >= valorNoAtual) {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(novoNo);
                    break;
                }
                currentNode = currentNode.getRight();
            } else {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(novoNo);
                    break;
                }
                currentNode = currentNode.getLeft();
            }
        }
    }

    public BinaryTreeNode remove(Integer element) {
        BinaryTreeNode nodeAtual = this.mainNode;
        if (nodeAtual == null) {
            throw new IndexOutOfBoundsException("Empty");
        }
        if (element == null) {
            throw new RuntimeException("Forbidden remove null value");
        }
        //cenário base onde elemento a remover é o mainNode
        if (nodeAtual.getElement().equals(element)) {
            BinaryTreeNode nodeRemover = nodeAtual;
            if (nodeAtual.getRight() != null) {
                nodeAtual = nodeAtual.getRight();
                while (nodeAtual.getLeft() != null) {
                    nodeAtual = nodeAtual.getLeft();
                }
            }

        }


        while (true) {



        }


    }

    @Override
    public String toString() {
        if (this.mainNode == null) {
            return "Árvore vazia";
        }
        return percorrerArvore(this.mainNode, 0);
    }

    private String percorrerArvore(BinaryTreeNode node, int nivel) {
        if (node == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        // Cria um recuo (espaçamento) baseado na profundidade do nó para ajudar na visualização
        String indentacao = "  ".repeat(nivel);

        sb.append(indentacao)
                .append("Nó: ").append(node.getElement())
                .append(" (Esq: ").append(node.getLeft() != null ? node.getLeft().getElement() : "null")
                .append(", Dir: ").append(node.getRight() != null ? node.getRight().getElement() : "null")
                .append(")\n");

        sb.append(percorrerArvore(node.getLeft(), nivel + 1));

        sb.append(percorrerArvore(node.getRight(), nivel + 1));

        return sb.toString();
    }
}
