class Solution {
  public int[] nextGreaterElements(int[] nums) {
      //Optimal using Stack
      Stack<Integer> stack = new Stack<>();
       int n = nums.length;
      int[] ans = new int[n];

      for(int i=2*n-1;i>=0;i--){
          while(!stack.isEmpty() && stack.peek() <= nums[i%n]){
              stack.pop();
          }
          if(i<n){
              if(stack.isEmpty()){
                  ans[i] = -1;
              }else{
                  ans[i] = stack.peek();
              }
          }
          stack.push(nums[i%n]);
      }
      return ans;

      //Solution with duplicating
      /*
       int n = nums.length;
      int[] newArr = new int[n * 2];
      int[] ans = new int[n];

      // Duplicate the array
      for (int i = 0; i < n; i++) {
          newArr[i] = nums[i];
          newArr[i + n] = nums[i];
      }

      // Initialize the answer array with -1
      for (int i = 0; i < n; i++) {
          ans[i] = -1;
      }

      // Find the next greater element in the duplicated array
      for (int i = 0; i < n; i++) {
          for (int j = i + 1; j < newArr.length; j++) {
              if (newArr[j] > nums[i]) {
                  ans[i] = newArr[j];
                  break;  // Exit the loop once the next greater element is found
              }
          }
      }

      return ans;

       */


      //Solution without Duplicating
      // int n = nums.length;
      // int[] ans = new int[n];
      
      // // Initialize the answer array with -1
      // for (int i = 0; i < n; i++) {
      //     ans[i] = -1;
      // }

      // // Iterate over each element
      // for (int i = 0; i < n; i++) {
      //     // Iterate over the elements after the current element, considering the circular array
      //     for (int j = 1; j < n; j++) {
      //         if (nums[(i + j) % n] > nums[i]) {
      //             ans[i] = nums[(i + j) % n];
      //             break;  // Exit the loop once the next greater element is found
      //         }
      //     }
      // }

      // return ans;
  }
}
