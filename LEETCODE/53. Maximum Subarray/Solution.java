


class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
           currentSum += num;
           maxSum = Math.max(maxSum, currentSum);
           if(currentSum < 0 ) currentSum = 0;
        }

        return maxSum;
    }
}
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;

//         for (int num : nums) {
//             currentSum = Math.max(num, currentSum + num);
//             maxSum = Math.max(maxSum, currentSum);
//         }

//         return maxSum;
//     }
// }
