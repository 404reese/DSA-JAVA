import java.util.HashSet;

public class IntersectionOfArray {
    public static void intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // for(int i=0;i<arr1.length;i++){
        //     set.add(arr1[i]);
        // }
        for(int i:arr1){
            set.add(i);
        }
        for (int i:arr2){
            if(set.contains(i)){
                resultSet.add(i);
            }
        }
        System.out.println("Intersection of set is "+resultSet);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3,4};
        intersection(arr1,arr2);
    }
}