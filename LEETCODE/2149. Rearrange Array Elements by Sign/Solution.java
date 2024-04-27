class Solution {
    public int[] rearrangeArray(int[] nums) {
        //Optimal
        int n = nums.length;
        int arr []= new int[n];

        int pos = 0;
        int neg = 1;

        for(int i =0; i < n ; i ++){
            if(nums[i] >= 0){
                arr[pos] = nums[i];
                pos = pos+2;
            } else{
                arr[neg] = nums[i];
                neg = neg+2;
            }
        }

        return arr;













        // int n = nums.length;
        // int[] even = new int[n/2];
        // int [] odd = new int [n/2];

        //     int j=0;
        //     int k=0;
        // for(int i=0;i<n;i++){

        //     if(nums[i] >= 0){
        //         even[j] = nums[i];
        //         j++;
        //     }else{
        //         odd[k] = nums[i];
        //         k++;
        //     }
        // }


        //    j=0;
        //   k=0;
        //   for(int i=0;i<n;i++){

        //     if(i %2 ==  0){
        //        nums[i] = even[j];
        //         j++;
        //     }else{
        //        nums[i] = odd[k];
        //         k++;
        //     }
        // }
        // return nums;
     }
}