import java.util.*;

public class Main {
    public static void main (String args[] ) {
        HashMap<String, Integer> map = new HashMap <> ();
        // insert
        map.put("India",10);
        map.put("China",30);
        map.put("USA",40);

        System.out.println(map);
        // check 
        if(map.containsKey("India")){
            System.out.println("map has india");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("UK"));

        // iteration method 1 : entry set
        // for (int val:arr)
        for (Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // iteration method 2 : normal set
        Set<String> keys= map.keySet();
        for (String key: keys){
            System.out.println(key+""+map.get(key));
        }


        // remove
        map.remove("China");
    }
}