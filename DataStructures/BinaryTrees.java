/*
 * Binary Trees
 */
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null; // for left subtree
        this.right = null; // for right subtree
    }
}
// main binary tree class
class binaryTree{
    public Node root; // start of the tree
    private int index;
    binaryTree(){
        root = null;
        index = - 1;
    }
    Node buildTree(int nodes[]){
        index++;
        if(nodes[index] == -1){
            return null;
        }
        Node temp = new Node(nodes[index]);
        temp.left = buildTree(nodes);
        temp.right = buildTree(nodes);
        return temp;
    }
    binaryTree(int nodes[]){
        index = - 1;
        root = buildTree(nodes);
    }
    void preorderTraverse(Node root){
        Node current = root;
        if(current == null){
            return;
        }
        System.out.print(current.data+" ");
        preorderTraverse(current.left);
        preorderTraverse(current.right);
    }
    void postorderTraverse(Node root){
        Node current = root;
        if(current == null){
            return;
        }
        preorderTraverse(current.left);
        preorderTraverse(current.right);
        System.out.print(current.data+" ");
    }
    void inorderTraverse(Node root){
        Node current = root;
        if(current == null){
            return;
        }
        preorderTraverse(current.left);
        System.out.print(current.data+" ");
        preorderTraverse(current.right);
    }
}
class BinaryTrees {
    public static void main(String[] args) {
        // nodes array for store in binarry tree in preorder 
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        /* 
                    1
                /      \
               2        3
              / \        \
             4  5         6
                
        */
        binaryTree tree = new binaryTree(nodes);
        System.out.println("Tree in preorder : ");
        tree.preorderTraverse(tree.root);
        System.out.println();
        System.out.println("Tree in postorder : ");
        tree.postorderTraverse(tree.root);
        System.out.println();
        System.out.println("Tree in inorder : ");
        tree.inorderTraverse(tree.root);
        System.out.println();
    }
}
