import java.util.HashMap;
import java.util.Map;

/*
 * HashMap is a data structure build upon hashing
 * there is key value pair in each element in hashmap
 */
public class hashMap {
    public static void main(String[] args) {
        //declaration
        HashMap<Integer,Integer> list = new HashMap<>();

        // puting key value pair
        list.put(01, 12);
        list.put(02, 34);

        // print the map
        System.out.println(list);

        // check if the key contains or not
        if(list.containsKey(03)){
            System.out.println("The key is present");
            System.out.println("The value of the key is : "+list.get(01));
        }else{
            System.out.println("The key is not present");
        }
        // interation of hashmap
        for(Map.Entry<Integer,Integer> e: list.entrySet()){
            System.out.println("Key "+e.getKey());
            System.out.println("Value "+e.getValue());
        }
    }
}
