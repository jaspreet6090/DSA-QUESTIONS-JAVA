//My Solution

class Solution {
    public void moveZeroes(int[] nums) {
         int n = nums.length;
        int[] arr = new int[n];
         int i=0;
      int j=0;
       for(;i<n;i++){
       if(nums[i] != 0){
         arr[j] = nums[i];
         j++;
       }else{
        continue;
       }
     }
      for(int k=0;k<n;k++){
   
            nums[k] = arr[k];
        }
    }
}


// class Solution {
//      public void moveZeroes(int[] nums) {
//         int snowBallSize = 0; 
//         for (int i=0;i<nums.length;i++){
// 	        if (nums[i]==0){
//                 snowBallSize++; 
//             }
//             else if (snowBallSize > 0) {
// 	            int t = nums[i];
// 	            nums[i]=0;
// 	            nums[i-snowBallSize]=t;
//             }
//         }
//     }
// }