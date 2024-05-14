class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i =0  ; i< nums.length-1 ; i ++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        } 
        return false;
    }
}
    //brute force
    // for(int i = 0 ; i < nums.length-1;i++){
    //         int num = nums[i];
    //         for(int j = i+1 ; j<nums.length ;j++){
    //             if(nums[j] == nums[i]){
    //                 return true;
    //             }else{
    //                 continue;
    //             }
    //         }
    //     }
    //     return false;