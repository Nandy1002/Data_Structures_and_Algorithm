import java.util.*;;
public class hashset {
    public static void main(String[] args) {
        // define a HashSet
       HashSet<Integer> myhash = new HashSet<>();

       // to add an element we use add method
       myhash.add(2);
       myhash.add(4);
       myhash.add(1);
       myhash.add(7);
       myhash.add(3);
       myhash.add(4); // this element is already added so it won't be added
       
        System.out.println(myhash); // prints the hashset wtih brackets

        // to print each element differently then we need to use iterator

        Iterator<Integer> iterator = myhash.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // contains method return true of element contain in set otherwise false
        if(myhash.contains(5)){
            System.out.println("Set Contains 5 element");
        }else{
            System.out.println("Set doesn't contain 5 element");
        }

        // remove method remove element from hashset
        myhash.remove(2);
        System.out.println(myhash);
    }
    
}
