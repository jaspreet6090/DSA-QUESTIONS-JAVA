class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
}



// class Solution {
//     public int singleNumber(int[] nums) {
//         int[] arr = new int[60001]; // Assuming the range of numbers is [-30000, 30000]
//         int num = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             int n = nums[i];
//             arr[n + 30000]++;
//         }
        
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 1) {
//                 num = i - 30000;
//                 break;
//             }
//         }
        
//         return num;
//     }
// }
