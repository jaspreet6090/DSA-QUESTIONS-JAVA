import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }
        
        return new int[]{}; // If no solution found
    }
}



// class Solution {
//     public int[] twoSum(int[] nums, int target) {
    
       
//          for(int i=0; i<nums.length-1;i++){
//              for(int j=i+1;j<nums.length;j++){
//                  if(nums[i] + nums[j] == target){
//                      return new int[]{i,j};
//                  }
//              }
//          } 
//          return new int[]{};  
//     }
// }