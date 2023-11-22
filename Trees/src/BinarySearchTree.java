public class BinarySearchTree <T extends Comparable>{
    private TNode<T> root;

    public void insert(T val){
        TNode<T> newNode= new TNode<>(val);
        if(root==null)
            root=newNode;
        else{
            TNode<T> iterator=root;
            while(iterator!=null){
                if(iterator.value.compareTo(val)==1){
                    if(iterator.left!=null)
                        iterator=iterator.left;
                    else {
                        iterator.left = newNode;
                        return;
                    }
                }else if(iterator.value.compareTo(val)==-1){
                    if(iterator.right!=null)
                        iterator=iterator.right;
                    else {
                        iterator.right = newNode;
                        return;
                    }
                }else{
                    System.out.println("duplicate value");
                    return;
                }

            }
        }

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