
class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> res = new ArrayList<>();
      Arrays.sort(nums);
      HashSet<String> unique = new HashSet<>();

      for (int i = 0; i < nums.length - 3; i++) {
          for (int j = i + 1; j < nums.length - 2; j++) {
              int left = j + 1;
              int right = nums.length - 1;

              while (left < right) {
                   long sum = nums[i];
                   sum += nums[j];
                  sum+= nums[left];
              sum+= nums[right];
                  if (sum < target) {
                      left++;
                  } else if (sum > target) {
                      right--;
                  } else {
                      StringBuilder sb = new StringBuilder();
                      sb.append(nums[i]).append(nums[j]).append(nums[left]).append(nums[right]);
                      String code = sb.toString();
                      if (!unique.contains(code)) {
                          unique.add(code);
                          res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                      }
                      left++;
                      right--;
                  }
              }
          }
      }
      return res;
    }
}
  //Brute Force
  //    List<List<Integer>> result = new ArrayList<>();
  //     if(nums == null || nums.length < 4)
  //         return result;

  //     Arrays.sort(nums);

  //     for(int i = 0; i < nums.length - 3; i++) {
  //         if(i > 0 && nums[i] == nums[i-1]) continue; // skip duplicates
  //         for(int j = i + 1; j < nums.length - 2; j++) {
  //             if(j > i + 1 && nums[j] == nums[j-1]) continue; // skip duplicates
  //             for(int k = j + 1; k < nums.length - 1; k++) {
  //                 if(k > j + 1 && nums[k] == nums[k-1]) continue; // skip duplicates
  //                 for(int l = k + 1; l < nums.length; l++) {
  //                     if(l > k + 1 && nums[l] == nums[l-1]) continue; // skip duplicates
  //                     int sum = nums[i] + nums[j] + nums[k] + nums[l];
  //                     if(sum == target) {
  //                         List<Integer> quadruplet = new ArrayList<>();
  //                         quadruplet.add(nums[i]);
  //                         quadruplet.add(nums[j]);
  //                         quadruplet.add(nums[k]);
  //                         quadruplet.add(nums[l]);
  //                         result.add(quadruplet);
  //                     }
  //                 }
  //             }
  //         }
  //     }

  //     return result;

