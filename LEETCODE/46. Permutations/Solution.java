class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        solve(nums,0,result);

        return result;
    }

    public void solve(int nums[], int idx,List<List<Integer>> result ){
        int n = nums.length;

        //base case
        if(idx == n-1){
            List<Integer> subList = new ArrayList<>();

            for(int i= 0 ; i<n;i++){
                subList.add(nums[i]);
            }

            result.add(new ArrayList<>(subList));
            return;
        }
        for(int i = idx; i<n ; i++)
        {
            swap(nums,i,idx);
            solve(nums,idx+1,result);
            //backtracking
            swap(nums,i,idx);
        }
    }
    public void swap(int nums[], int i1, int i2)
    {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}