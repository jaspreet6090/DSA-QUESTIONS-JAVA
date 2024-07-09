public class MinimumSwapsforBracketBalancing {
  //{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minimumNumberOfSwaps(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int minimumNumberOfSwaps(String s) {
       int open=0,close=0,unbalanced=0,swaps=0;
       for(char ch : s.toCharArray()){
           if(ch == '['){
               open++;
               if(unbalanced > 0){
                   swaps += unbalanced;
                   unbalanced--;
               }
           }else{
               close++;
               unbalanced = close - open;
           }
       }
       return swaps;
    }
}
}
