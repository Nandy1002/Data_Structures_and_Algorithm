/*
 * Queue Data Structure with Linked List
 * enqueue time Complexity - O(1)
 * dequeue time Complexity - O(1)
 */

// Node class for each node in Queue
class Node{
    int data;
    Node next;      
    Node(int data){
        this.data = data;
        this.next = null;
    }  
}
// Queue define with linkedlist
class QueueLL{
    Node head;
    int size;
    QueueLL(){
        head = null;
        size = 0;
    }
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    // add node at the end of the queue
    void enQueue(int data){
        Node newnode = new Node(data);
        size++;
        if(isEmpty()){
            head = newnode;
            return;
        }else{ 
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;
        }
    }
    // delete first node
    void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is already Empty");
            return;
        }
        Node first = head;
        head = head.next;
        first.next = null;
        size--;
    }
    void printQueue(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
public class queueLinkedList {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.enQueue(12);
        queue.enQueue(23);
        queue.enQueue(34);
        queue.enQueue(45);
        queue.enQueue(56);
        System.out.println(queue.isEmpty());
        System.out.println("Before dequeueing : ");
        queue.printQueue();
        System.out.println("Size of Queue : "+queue.size);
        queue.deQueue();
        queue.deQueue();
        System.out.println("After dequeueing : ");
        queue.printQueue();
    }
}
