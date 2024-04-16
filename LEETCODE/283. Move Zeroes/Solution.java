class Solution {
    public int trap(int[] height) {
      //optimal
     
        int l = 0; 
        int r = height.length - 1;
        int sum = 0;
        int leftBar = height[l];
        int  rightBar = height[r];
        
        while (l < r) {
            if (leftBar <= rightBar) {
                sum += leftBar - height[l];
                l++;
                leftBar = Math.max(leftBar, height[l]);
            } else {
                sum += rightBar - height[r];
                r--;
                rightBar = Math.max(rightBar, height[r]);
            }
        }

        return sum;
    }
}
      
      
      
      //Brute force


        //       int maxheight = 0;

        // for(int i = 1; i < height.length - 1; i++){ // Changed the loop condition to exclude the first and last elements
        //     int ht = height[i];
        //     int leftmax = 0; // Initialized leftmax and rightmax
        //     int rightmax = 0;
        //     int left = i - 1;
        //     int right = i + 1;
            
        //     // Finding left max height
        //     while(left >= 0){
        //         if(height[left] > leftmax){
        //             leftmax = height[left];
        //         }
        //         left--;
        //     }

        //     // Finding right max height
        //     while(right < height.length){
        //         if(height[right] > rightmax){
        //             rightmax = height[right];
        //         }
        //         right++;
        //     }

        //     // Calculating the trapped water at the current index
        //     maxheight += Math.max(0, Math.min(leftmax, rightmax) - ht);
        // }
        // return maxheight;
