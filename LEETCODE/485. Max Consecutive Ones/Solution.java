class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int n = nums.length;
        int count = 0;
        int currCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                currCount++; // Increment the current count of consecutive ones
                count = Math.max(count, currCount); // Update the maximum count if necessary
            } else {
                currCount = 0; // Reset the current count if we encounter a zero
            }
     
        }
    return count;
    }
}