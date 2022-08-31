class circularLinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    int size; // for keeping the length of the linkedList
    Node head; // for keeping the first node of the cicrular linkedList
    circularLinkedList(){
        size = 0;
        head = null;
    }
    // add method for adding a new element at the end of the linkedList otherwise create newn node in linkedList
    public void add(int data){
        Node node = new Node(data);
        size++;
        if(head == null){
            head = node;
            node.next = head;
            return;
        }
        if(head.next == head){
            head.next = node;
            node.next = head;
            return;
        }
        Node current = head;
        while(current.next != head){
            current = current.next;
        }
        current.next = node;
        node.next = head;
    }

    // overloading add method for adding data node at a proper index in linkedList
    public void add(int index, int data){
       if(size<index){
            System.out.println("Index out of Bound");
            return;
        }
         Node node = new Node(data);
        size++;
        Node current = head;
        for(int i=0;i<index-1;i++){
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

    // printList method prints all the data in the linkedList
    public void printList(){
        if(head == null){
            System.out.println("No Node added to print");
            return;
        }
        if(head.next == head){
            System.out.println(head.data +" -> head");
            return;
        }
        Node current = head;
        while(current.next != head){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data + " -> head");
        System.out.println();
    }

    // remove method remove the last node from the linkList
    public void remove(){
        if(size == 0){
            System.out.println("No Node available to delete");
            return;
        }
        Node current = head;
        while(current.next.next != head){
            current = current.next;
        }
        Node temp = current.next;
        current.next = head;
        temp.next = null;
        size--;
    }

    // overloading the remove element to removing the data node at required index
    public void remove(int index){
        if(size == 0){
            System.out.println("No Node available to delete");
            return;
        }
        Node current = head;
        size--;
        if(index == 0){
            Node temp = head;
            while(current.next != head){
                current = current.next;
            }
            head = head.next;
            current.next = head;
            temp.next = null;
            return;
        }
        for(int i=0;i<index-1;i++){
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        temp.next = null;
    }

    // length method used to return the length(size) of the LinkedList
    public int length(){
        return size;
    }
    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.add(23); 
        // list.add(3,22);
        list.add(12);
        list.add(2,25);
        list.add(34);
        System.out.println("Circular LinkedList before removing nodes : ");
        System.out.println(list.length());
        list.printList();

        list.remove();
        list.remove(0);
        System.out.println("Circular LinkedList after removing nodes : ");
        System.out.println(list.length());
        list.printList();
    }
}

