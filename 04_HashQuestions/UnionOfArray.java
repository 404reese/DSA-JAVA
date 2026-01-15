
import java.util.HashSet;


public class UnionOfArray {

    public static void UnionOfArray (int arr1[], int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++) {
            set.add(arr2[i]);
        }
        System.out.println("size of union is "+set.size());
    }
    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {3,2};

        UnionOfArray(arr1, arr2);
    }
}


// gfg question
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<nums1.length;i++) {
            set.add(nums1[i]);
        }
        for (int i=0; i<nums2.length;i++) {
            set.add(nums2[i]);
        }

        int result[]=new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        
        return result;
    }
}