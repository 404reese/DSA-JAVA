

public class For {
    public static void main (String args[] ) {
        
        int arr[] = {12,13,14};
        // normal
        for (int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
        // without pointer/index
        for (int val : arr) {
            System.out.println(val);
        }

        
    }
}