package Trees.BinarySearchTree;

public class BinarySearchTree {
    private BinaryTreeNode root;

    public BinarySearchTree() {
    }

    public BinaryTreeNode lookup(Integer element) {
        if (element == null) {
            throw new RuntimeException("Forbidden search null value");
        }
        BinaryTreeNode noAtual = this.root;
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
        if (this.root == null) {
            this.root = novoNo;
            return;
        }
        BinaryTreeNode currentNode = this.root;
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
        if (this.root == null) {
            throw new RuntimeException("Empty Tree");
        }
        BinaryTreeNode noAtual = root;
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

        //elemento nao encontrado
        if (noAtual == null) {
            return null;
        }

        BinaryTreeNode noRemover = noAtual;

        //folha
        if (isFolha(noRemover)) {
            if (paiNoAtual == null) {
                this.root = null;
            } else if (paiNoAtual.getLeft() == noRemover) {
                paiNoAtual.setLeft(null);
            } else {
                paiNoAtual.setRight(null);
            }
            return noRemover;
        }

        //somente um filho
        if (isFilhoUnico(noRemover)) {
            BinaryTreeNode filhoUnico = (noRemover.getLeft() != null) ? noRemover.getLeft() : noRemover.getRight();

            if (paiNoAtual == null) {
                this.root = filhoUnico;
            } else if (paiNoAtual.getRight() == noRemover) {
                paiNoAtual.setRight(filhoUnico);
            } else {
                paiNoAtual.setLeft(filhoUnico);
            }
            return noRemover;
        }

        //dois filhos
        BinaryTreeNode retornarNo = new BinaryTreeNode(noRemover.getElement());
        BinaryTreeNode noSubstituirPai = noRemover;
        BinaryTreeNode noSubstituir = noRemover.getRight();


        while (noSubstituir.getLeft() != null) {
            noSubstituirPai = noSubstituir;
            noSubstituir = noSubstituir.getLeft();
        }

        noRemover.setElement(noSubstituir.getElement());

        //se cair neste if eh pq passou no loop
        if (noSubstituirPai.getLeft() == noSubstituir) {
            //vou setar o da direita do noSubstituir ao paiNoSubstituir pq left de substituir eh null
            noSubstituirPai.setLeft(noSubstituir.getRight());
        } else {
            noSubstituirPai.setRight(noSubstituir.getRight());
        }
        return retornarNo;
    }

    private boolean isFilhoUnico(BinaryTreeNode noRemover) {
        return noRemover.getRight() == null || noRemover.getLeft() == null;
    }

    private boolean isFolha(BinaryTreeNode noRemover) {
        return noRemover.getRight() == null && noRemover.getLeft() == null;
    }


    @Override
    public String toString() {
        if (this.root == null) {
            return "Árvore vazia";
        }
        return percorrerArvore(this.root, 0);
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
