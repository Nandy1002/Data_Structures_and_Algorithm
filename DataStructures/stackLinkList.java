/*
 * Stack Data Structure with LinkedList.
 * This is a LIFO type dsa ( Last In First Out )
 * Time Complexity
 * push - O(1)
 * pop - O(1)
 * peek - O(1)
 */

// node class for storing data
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Stack{
    static Node head; // top or head element of the stack

    // constructor for stack
    Stack(){
        head = null;
    }
    Stack(int data){
        head = null;
        push(data);
    }

    // push method push a data node in the stack
    public void push(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    
    // pop method pops the last data node from the stack
    public void pop(){
        Node poped = head;
        head = head.next;
        poped.next = null;
        System.out.println("Popped : "+poped.data);
    }
    // peek method return the value of the head or top node
    public int peek(){
        return head.data;
    }
}
public class stackLinkList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(12);
        s.push(23);
        s.push(34);
        // null<- 12 <- 23 <- 34 (head)
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
