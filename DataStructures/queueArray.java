/*
 * Circular Queue Data Structure with Array
 */
class QueueAR{
    int array[];
    int front;
    int rear;
    QueueAR(){
        array = new int[10];
        front = -1;
        rear = -1;
    }
    QueueAR(int size){
        array = new int[size];
        front = -1;
        rear = -1;
    }
    boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    boolean isFull(){
        return (rear + 1) % array.length == front;
    }
    // add elements in queue in rear
    void enqueue(int data){
        if(isFull()) {
            System.out.println("Queue Overflowed");
            return;
        }
        //if it's the 1st element
        if(front == -1) {
            front = 0;
        }

        rear = (rear + 1) % array.length;
        array[rear] = data;
    }
    // remove the element from the front
    int dequeue(){
        if(isEmpty()) {
            System.out.println("empty queue");
            return -1;
        } 
        int res = array[front];

        //if only 1 element is present
        if(front == rear) {
            front = rear = -1;
        } else {
            front = (front+1) % array.length;
        }

        return res;

    }
}
public class queueArray {
    public static void main(String[] args) {
        QueueAR list = new QueueAR();
        list.enqueue(12);
        list.enqueue(23);
        list.enqueue(34);
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
    }
    
}
