import java.util.*;


public class HashMapImpl {

    // hashmap data structure
    static class HashMap <K,V> { // generic definition
        private class Node {
            K key;
            V value;

            public Node (K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    

    private int n; //nodes
    private int N; //buckets

    // private int arr[]
    private LinkedList<Node> buckets[];

    @SuppressWarnings("unchecked") // for ignoring type warning
    // constructor
    public HashMap() {
        this.N=4;
        this.buckets=new LinkedList[4];
        // creating empty LL at each index
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }
    }

    public void rehash() {
        LinkedList<Node> oldBucket[] = buckets;
        buckets = new LinkedList[N*2];

        for (int i=0; i<oldBucket.length; i++){
            LinkedList<Node> ll = oldBucket[i];

            for (int j=0; j<ll.size();j++){
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
    }

    public int HashFuction(K key){
        int bi = key.hashCode(); // returns hashcode of object 
        return Math.abs(bi)%N; // we make it +ve n try to fit in range of 0 to N-1
    }

    public int searchInLL(K key, int bi){
        // bucket id wali LL
        LinkedList ll = buckets[bi];

        for(int i=0; i<ll.size();i++){
            if(ll.get(i).key == key){ // ll.get(i) -> node
                return i;
            }
        }
        return -1;
    }


    public void put (K key, V value) {
        int bi = HashFuction(key); // get bucket index
        int di = searchInLL(key, bi); // get data index

        if (di == -1){ // key does not exist
            buckets[bi].add(new Node(key,value));
            n++;
        } else { // key exist
            Node node = buckets[bi].get(di);
            node.value = value;
        }

        double lamba=(double)n/N;
        if(lamba>2.0){
            rehash();
        }
    }
    public V get(K key) { // V is Generic Type
        int bi = HashFuction(key); // get bucket index
        int di = searchInLL(key, bi); // get data index

        if (di == -1){ // key does not exist
            return null;
        } else { // key exist
            Node node = buckets[bi].get(di);
            return node.value ;
        }
    }

    public V remove (K key) {
        int bi = HashFuction(key); 
        int di = searchInLL(key, bi); 

        if (di == -1){ 
            return null;
        } else { 
            Node node = buckets[bi].remove(di);
            return node.value ;
        }
    }

    public boolean containsKey (K key) { 
        int bi = HashFuction(key); 
        int di = searchInLL(key, bi); 

        if (di == -1){ // key does not exist
            return true;
        } else { // key exist
            return false ;
        }
    }

    public boolean isEmpty() {
        return n == 0;
    }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("USA", 200);
        map.put("UK", 300);
        map.put("Germany", 400);

    }
}