class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
         int row = mat.length;
       int col = mat[0].length;
        int start = 0;
        int end = row * col  -1;

        while (start <= end){

           int  mid = start + (end - start )/2;

            if(mat[mid/col][mid%col] > target){
                end = mid -1 ;
            }else if(mat[mid/col][mid%col]  < target) {
                    start = mid+1;
            } else{
                return true;
            }
        }
        return false;
    }
}