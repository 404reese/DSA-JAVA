class Solution {
    public int countDigit(int n) {
        int count=0;
        while (n>0) {       
        int lastdigit=n%10;
        n=n/10;
        count++
        }
        return count;
    }
}


// https://takeuforward.org/plus/dsa/problems/count-all-digits-of-a-number

// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself.

// Examples:
// Input: n = 4
// Output: 1
// Explanation: There is only 1 digit in 4.
