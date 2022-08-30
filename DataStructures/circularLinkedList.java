class circularLinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    int size;
    Node head;
    circularLinkedList(){
        size = 0;
        head = null;
    }
}
