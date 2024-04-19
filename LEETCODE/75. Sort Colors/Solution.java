class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


// class Solution {
//     public void sortColors(int[] nums) {
    
//         int n = nums.length;
//         int count0= 0; 
//         int count1 = 0;
//         int count2 = 0;

//         for(int i = 0; i<n;i++){
//             int num = nums[i];

//             if(num == 0) {count0++;}
//             else if(num == 1){ count1++;}
//             else{ count2++;
        
//                 }
//         }

//         for(int i=0;i<count0;i++){
//             nums[i] = 0;
           
//         }
//         for(int i=count0;i<count0+count1;i++){
//             nums[i] = 1;
           
//         }
//          for(int i=count0+count1;i<n;i++){
//             nums[i] = 2;
           
//         }
//     }
// }