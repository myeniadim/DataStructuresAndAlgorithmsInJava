public class BinarySearchTree <T extends Comparable> {
    private TNode<T> root;

    public void insert(T val) {
        TNode<T> newNode = new TNode<>(val);
        if (root == null)
            root = newNode;
        else {
            TNode<T> iterator = root;
            while (iterator != null) {
                if (iterator.value.compareTo(val) == 1) {
                    if (iterator.left != null)
                        iterator = iterator.left;
                    else {
                        iterator.left = newNode;
                        return;
                    }
                } else if (iterator.value.compareTo(val) == -1) {
                    if (iterator.right != null)
                        iterator = iterator.right;
                    else {
                        iterator.right = newNode;
                        return;
                    }
                } else {
                    System.out.println("duplicate value");
                    return;
                }

            }
        }
    }
    public void insertRecursive(T val) {
        root = insertRecursive(root, val);
    }

    private TNode<T> insertRecursive(TNode<T> root, T val) {
        if (root == null) {
            return new TNode<>(val);
        }

        if (val.compareTo(root.value) < 0) {
            root.left = insertRecursive(root.left, val);
        } else if (val.compareTo(root.value) > 0) {
            root.right = insertRecursive(root.right, val);
        } else {
            // Duplicate values are not allowed, handle as needed
            System.out.println("Duplicate value: " + val);
        }

        return root;
    }
    public void deleteNode(T val){
        deleteNode(root, val);
    }
    public TNode<T> deleteNode(TNode<T> root, T val) {
        if (root == null) {
            return root;
        }

        // Search for the node to be deleted
        if (val.compareTo(root.value) < 0) {
            root.left = deleteNode(root.left, val);
        } else if (val.compareTo(root.value) > 0) {
            root.right = deleteNode(root.right, val);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.value);
        }

        return root;
    }

    private T minValue(TNode<T> node) {
        T minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }
    public boolean search(T val) {
        return (search(val, root) != null);
    }

    public TNode<T> search(T val, TNode<T> searchRoot) {
        if (searchRoot == null)
            return null;
        if (searchRoot.value.compareTo(val) == 0)
            return searchRoot;
        else if (searchRoot.value.compareTo(val) == 1)
            return search(val, searchRoot.left);
        else if (searchRoot.value.compareTo(val) == -1)
            return search(val, searchRoot.right);
        return null;
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TNode<T> root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root);
            inOrder(root.right);
        }
    }

}