import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main (String args[]) {
        // create
        HashSet<Integer> set = new HashSet<>();
        
        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size check
        System.out.println("size of hash set "+set.size());
        System.out.println(set);

        //check 
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }else {
            System.out.println("set does not contains 1");
        }
        
        //delete
        set.remove(1);
        if (set.contains(1)) {
            System.out.println("set contains 1");
        } else {
            System.out.println("set does not contains 1");
        }
        System.out.println("size of hash set "+set.size());



        // iterator 
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}