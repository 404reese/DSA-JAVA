## Initial Code (for loop with extra `int i`)

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {  
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
```

## Better Version (Enhanced for-loop)

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;
    }
}
```

## Other Approaches

### Brute Force

* Time Complexity: `O(n^2)`
* Compare each element with every other element

### Sorting + Checking Adjacent

* Time Complexity: `O(n log n)`
* Sort the array and check:

```java
if (nums[i] == nums[i + 1]) {
    return true;
}
```
