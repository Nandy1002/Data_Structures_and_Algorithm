import java.util.ArrayList;

/*
 * Stack with ArrayList
 */
class Stack2{
    ArrayList<Integer> list = new ArrayList<>();
    Stack2(){}
    boolean isEmpty(){
        if(list.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    // push 
    void push(int data){
        list.add(data);
    }
    void pop(){
        if(this.isEmpty()){
            System.out.println("Nothing to Pop");
            return;
        }
        System.out.println("Popped " + list.get(list.size()-1));
        list.remove(list.size()-1);
    }
    int peek(){
        return list.get(list.size() - 1);
    }
}

public class stackArrayList {
    public static void main(String[] args) {
        Stack2 s = new Stack2();
        s.push(12);
        s.push(34);
        s.push(42);
        System.out.println("Peek Element " +s.peek());
        
        s.pop();
        s.pop();
        System.out.println("Peek Element " +s.peek());
    }
}
