class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }

        int height[] = new int[matrix[0].length]; 
        int largest = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int val = matrix[i][j] - '0' ; //char to int
                if(val ==0){
                    height[j] = 0;
                }else{
                    height[j] += val;
                    }
                }
                max = largestRectangleArea(height);
                if(largest <max){
                    largest = max;
            }
        }
            return largest;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<=n;i++){
            int ele = (i==n)?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > ele){
                int h = heights[stack.pop()];
                int ps = (stack.isEmpty())?-1:stack.peek();
                int w = i - ps - 1;
                max = Math.max(max,h*w);
            }
            stack.push(i);
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}