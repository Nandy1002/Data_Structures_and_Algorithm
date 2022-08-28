class normalLinkedList {
    // Node class is used for getting each node in the LinkedList
    public class Node{
        private int data; // the data part of our each node
        private Node next; // store the address of next node

        // node constructor with data
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head; // head is for identify the first node of the linkedList
    private int size; // size is for remember the length of the linkedlist in O(1)
    
    // linkedList Constructor which initilize head and the size(length)
    normalLinkedList(){
        head = null;
        size = 0;
    }
    
    // add method for adding a new element at the end of the linkedList otherwise create newn node in linkedList
    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // overloading add method for adding data node at a proper index in linkedList
    public void add(int index, int data){
        Node newNode = new Node(data);
        size++;
        if(index>=size){
            System.out.println("Index is out of bound");
            return;
        }
        Node currentNode = head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // addFirst method added a new data node at the begining of the LinkedList
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // printList method prints all the data in the linkedList
    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // remove method remove the last node from the linkList
    public void remove(){
        if(head == null){
            System.out.println("No nodes available to delete");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node lastNode = head;
        while(lastNode.next.next.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next.next = null;
    }

    // overloading the remove element to removing the data node at required index
    public void remove(int index){
        if(head == null){
            System.out.println("No nodes available to delete");
            return;
        }
        size--;
        Node currentNode = head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.next;
        }
        Node indexNode = currentNode.next;
        currentNode.next = indexNode.next;
        indexNode.next = null;
    }

    // removeFirst method remove the head or first node of the LinkList
    public void removeFirst(){
        Node firstNode = head;
        head = firstNode.next;
        firstNode.next = null;
        size--;
    }

    // length method used to return the length(size) of the LinkedList
    public int length(){
        return size;
    }
    public static void main(String[] args) {
        normalLinkedList list = new normalLinkedList();
        list.add(22);
        list.add(12);
        list.add(84);
        list.addFirst(39);
        list.add(1,43);
        System.out.println("After Adding elements: ");
        list.printList();
        System.out.println(list.length());
        list.remove(2);
        list.removeFirst(); 
        list.remove();
        System.out.println("After Deleteing elements: ");
        System.out.println(list.length());
        list.printList();
    }    
}
