class Solution {
  public int missingNumber(int[] nums) {
  //    int xor1 = 0;
  //    int xor2 = 0;
  //    int n = nums.length;

  //    
  //        xor2 = xor2 ^ nums[i];
  //        xor1 = xor1 ^ i;
  //    }

  //    xor1 = xor1 ^ n;
  //    return xor1 ^ xor2;

      int n = nums.length;
      long sum = (n * (n+1) )/2;

      int s2=0;

      for (int i = 0; i < n; i++) {
          s2+= nums[i];
      }

      return (int)(sum-s2); //converting long to int

  }
}
