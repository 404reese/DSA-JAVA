if sorted array is given 
class Solution {
    public boolean containsDuplicate(int[] nums) {
    
        for (int i=0;i<nums.length-1;i++){
            int j = i+1;
            if(nums[i]==nums[j]) {
                return true;
            }
            j++;
        }
        return false;
    }
}

unsorted array -> hashset