/**
 * doublyLInkedLIst
 */
class doublyLInkedLIst {
    
    // The data node class which store adress of both left and right node
    public class Node{
        int data;
        Node left;
        Node right;
        
        // node constructure
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private int size; // this varible is used for store the length of the linkedList
    private Node head; // for pointing the first node of the linkedList
    doublyLInkedLIst(){
        head = null;
        size = 0;
    }

    // add method add a data node in the end of the linkList or create first node if head == null
    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.right != null){
            lastNode = lastNode.right;
        }
        lastNode.right = newNode;
        newNode.left = lastNode;
    }
    
    // overloading add method with index to add data node in required index
    public void add(int index, int data){
        if(index > size){
            System.out.println("Index out of Bound");
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node currentNode = head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.right;
        }
        newNode.left = currentNode;
        newNode.right = currentNode.right;
        currentNode.right = newNode;
        newNode.right.left = newNode;

    }
    
    // addFirst method used to store data node at the first of the linkedList
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        Node firstNode = head;
        newNode.right = firstNode;
        firstNode.left = newNode;
        head = newNode;
    }

    // remove method remove an data node from the end or right;
    public void remove(){
        if(size == 0){
            System.out.println("Nothing to remove in the doubly Linked List");
        }
        Node lastNode = head;
        while(lastNode.right.right != null){
            lastNode = lastNode.right;
        }
        lastNode.right.left = null;
        lastNode.right = null;
        size--;
    }

    // overloading remove method for deleteing data node at the required index
    public void remove(int index){
        if(size == 0){
            System.out.println("Nothing to remove in the doubly Linked List");
        }
        if(index > size){
            System.out.println("Index out of Bound");
            return;
        }
        Node currentNode = head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.right;
        }
        Node indexNode = currentNode.right;
        currentNode.right = indexNode.right;
        indexNode.right.left = currentNode;
        indexNode.left = null;
        indexNode.right = null;
        size--;
    }
    
    // removeFirst method remove the first data node from the linkedList
    public void removeFirst(){
        Node firstNode = head;
        Node newfirstNode = head.right;
        firstNode.right = null;
        newfirstNode.left = null;
        head = newfirstNode; 
        size--;
    }

    // printList method prints the data nodes in the doubly LinkedList
    public void printList(){
        Node currentNode = head;
        System.out.print("NULL <-> ");
        for(int i=0;i<size;i++){
            System.out.print(currentNode.data +" <-> ");
            currentNode = currentNode.right;
        }
        System.out.print("NULL");
        System.out.println();
    }

    // length method returns the length of the linkedList
    public int length(){
        return size;
    }
    public static void main(String[] args) {
        doublyLInkedLIst list = new doublyLInkedLIst();
        list.add(11);
        list.add(22);
        list.add(25);
        list.add(1, 33);
        list.addFirst(9);
        System.out.println("Print the doubly linked list before removeing: ");
        list.printList();
        System.out.println("Size: "+ list.length());
        list.remove();
        list.removeFirst();
        list.remove(1);
        System.out.println("Print the doubly linked list after removing: ");
        list.printList();
        System.out.println("Size: "+ list.length());
        
    }
}