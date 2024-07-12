import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int ast : asteroids){
            // We have to deal with collisions only if the top of the stack is a right-moving asteroid and the current one is   a         left-moving asteroid
            while(!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int top = stack.peek();
                int absAst = Math.abs(ast);

                if(top > absAst) {
                    ast = 0; // current asteroid gets destroyed
                } else if(top < absAst) {
                    stack.pop(); // top asteroid gets destroyed, continue to check new top
                } else {
                    stack.pop(); // both asteroids are of the same size and get destroyed
                    ast = 0;
                }
            }

            if(ast != 0) {
                stack.push(ast);
            }
        } 

        int [] result = new int[stack.size()];
        for(int i = result.length - 1; i >= 0; i--){
            result[i] = stack.pop();
        }

        return result;
    }
}
