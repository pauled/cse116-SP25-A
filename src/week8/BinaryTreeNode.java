package week8;

public class BinaryTreeNode<A> {
    public A value;
    public BinaryTreeNode<A> left;
    public BinaryTreeNode<A> right;

    public BinaryTreeNode(A value, BinaryTreeNode<A> left,BinaryTreeNode<A> right){
        this.value=value;
        this.right=right;
        this.left=left;
    }
    public String preOrderTraveersal(BinaryTreeNode node){
        /*
        top
        left child
        right child
         */
        if (node==null){
            return "";
        }
        String out="";
        out+=node.value.toString()+" ";
        out+=preOrderTraveersal(node.left);
        out+=preOrderTraveersal(node.right);
        return out;
    }
    public String postOrderTraversal(BinaryTreeNode node){
        /*
        top
        left child
        right child
         */
        if (node==null){
            return "";
        }
        String out="";
        out+=postOrderTraversal(node.left);
        out+=postOrderTraversal(node.right);
        out+=node.value.toString()+" ";
        return out;
    }

    /*
    post order
    left right top
    in order left top right
     */
    public String inOrderTraversal(BinaryTreeNode node){
        if (node==null){
            return "";
        }
        String out="";
        out+=inOrderTraversal(node.left);
        out+=node.value.toString()+" ";
        out+=inOrderTraversal(node.right);
        return out;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5, null, null);
        root.left = new BinaryTreeNode<>(2, null, null);
        root.right = new BinaryTreeNode<>(8, null, null);
        root.left.left = new BinaryTreeNode<>(-3, null, null);
        root.left.right = new BinaryTreeNode<>(4, null, null);
        root.right.left = new BinaryTreeNode<>(7, null, null);
        root.right.right = new BinaryTreeNode<>(14, null, null);
        System.out.println(root.preOrderTraveersal(root));
        System.out.println(root.postOrderTraversal(root));
        System.out.println(root.inOrderTraversal(root));
    }
}
