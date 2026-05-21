package Trees.BinarySearchTree.teste;

import Trees.BinarySearchTree.BinarySearchTree;

public class BinarySearchTreeTeste {
    static void main() {
//        testeInsert();
        testeLookup();
    }

    private static void testeInsert() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);
        System.out.println(bst.toString());
    }

    private static void testeLookup() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);
        System.out.println(bst.toString());
        System.out.println("Lookup: " + bst.lookup(4));
    }
}
