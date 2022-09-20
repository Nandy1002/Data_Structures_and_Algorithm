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
    void traverse(){
        System.out.println(root.data);
    }
}
class BinaryTrees {
    public static void main(String[] args) {
        // nodes array for store in binarry tree in preorder 
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree tree = new binaryTree(nodes);
        tree.traverse();
    }
}
