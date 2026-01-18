import java.util.HashSet;

class Solution {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : nums) {
            set.add(num);
        }
        // 2 - 10 = 8
        // does 8 exist -> yes increase value of count
        System.out.println(set);
        return true; // temporary return
    }

    public static void main(String[] args) {
        int nums[] = {5, 2, 6, 4};
        checkSubarraySum(nums, 10);
    }
}
