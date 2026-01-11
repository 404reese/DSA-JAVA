import java.util.HashMap;

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
    }
}