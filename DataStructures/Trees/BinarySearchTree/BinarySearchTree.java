package Trees.BinarySearchTree;

public class BinarySearchTree {
    private BinaryTreeNode mainNode;

    public BinarySearchTree() {
    }

    public Integer lookup(Integer element) {
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
        BinaryTreeNode lastNode = null;
        while (currentNode != null ) {
            lastNode = currentNode;
            if (currentNode.getElement() <= element) {
                currentNode = currentNode.getRight();
            } else {
                currentNode = currentNode.getLeft();
            }
        }

    }
}
