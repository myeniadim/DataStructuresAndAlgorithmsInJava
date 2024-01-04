public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> myTree = new BinarySearchTree<>();
        myTree.insert(10);
        myTree.insert(5);
        myTree.insert(2);
        myTree.insert(7);
        myTree.insert(8);
        myTree.insert(15);
        myTree.insert(13);
        myTree.insert(11);
        myTree.insert(14);
        myTree.insertRecursive(17);

        myTree.inOrder();

        myTree.deleteNode(2);

        myTree.inOrder();
    }
}