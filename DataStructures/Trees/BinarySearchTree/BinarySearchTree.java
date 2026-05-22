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
        if (element == null) {
            throw new RuntimeException("Forbidden search null value");
        }
        if (this.mainNode == null) {
            throw new RuntimeException("Empty Tree");
        }
        BinaryTreeNode noAtual = mainNode;
        BinaryTreeNode paiNoAtual = null;

        while (noAtual != null) {
            Integer elementoNoAtual = noAtual.getElement();
            if (elementoNoAtual.equals(element)) {
                break;
            } else if (element > elementoNoAtual) {
                paiNoAtual = noAtual;
                noAtual = noAtual.getRight();
            } else {
                paiNoAtual = noAtual;
                noAtual = noAtual.getLeft();
            }
        }

        BinaryTreeNode noRemover = noAtual;
        noAtual.setLeft(null);
        noAtual.setRight(null);

        //elemento nao encontrado
        if (noRemover == null) {
            return null;
        }

        //se nao tem pai é porque noAtual é mainNode
        if (paiNoAtual == null) {
            this.mainNode = null;
            return noRemover;
        }

        //folha
        if (noRemover.getRight() == null && noRemover.getLeft() == null) {
            if (paiNoAtual.getLeft() == noRemover) {
                paiNoAtual.setLeft(null);
            } else {
                paiNoAtual.setRight(null);
            }
            return noRemover;
        }

        //somente um filho
        if ((noRemover.getLeft() != null && noRemover.getRight() == null) || (noRemover.getLeft() == null && noRemover.getRight() != null)) {
            if (paiNoAtual.getRight() == noRemover) {
                paiNoAtual.setRight(noRemover.getRight() != null ? noRemover.getRight() : noRemover.getLeft());
            } else {
                paiNoAtual.setLeft(noRemover.getRight() != null ? noRemover.getRight() : noRemover.getLeft());
            }
            return noRemover;
        }
        //dois filhhos
        BinaryTreeNode noPaiSubstituir = noRemover.getRight();
        Integer numeroRemover = noRemover.getElement();
        if (noRemover.getLeft() != null) {
            while (true) {
                noRemover = noRemover.getLeft();
                if (noRemover.getLeft() == null) {
                    break;
                }
            }
        }


        return null;
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
