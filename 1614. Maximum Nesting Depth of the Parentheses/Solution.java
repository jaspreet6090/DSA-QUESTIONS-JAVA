class Solution {
    public int maxDepth(String s) {
       int depth = 0;
        int count = 0;

        for(int i = 0 ; i < s.length() ; i ++){
           if(s.charAt(i) == '('){
               count++ ; 
               if(depth < count){
                   depth = count;
               }
           } else if (s.charAt(i) == ')'){
                if(depth < count){
                   depth = count;
               }
               count--;
           }
        }
  
        if(count == 0 || count < 0 ){
            return depth;
        } else {
          return  depth - count ;
        }

    }
    
    }