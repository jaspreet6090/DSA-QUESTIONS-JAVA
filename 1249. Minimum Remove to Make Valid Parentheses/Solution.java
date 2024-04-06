class Solution {
    public String minRemoveToMakeValid(String str) {
          Stack<Integer> stack = new Stack<Integer>();
          for(int i = 0 ; i < str.length() ; i++){
             char ch = str.charAt(i);
         if(ch == '(' || ch == ')'){
                       if(ch == '(' ){
                        stack.push(i);
                } else if(ch == ')') {
                     if (!stack.empty() && str.charAt(stack.peek() ) == '(' ){
                    stack.pop();
                     } else{
                    stack.push(i);
                     }
                      }
             }
        }
         while(!stack.empty()){
     
        int index =stack.pop();
        String part1 =  str.substring(0, index);
         String  part2 =  str.substring(index+1);
           if( part1.isEmpty() ||  part1 == "(" || part1 == ")") {
              str = part2 ;
           }  else if(part2.isEmpty() ||  part2 == "(" || part2 == ")"){
              str = part1;
           }   else {
           str = part1 + part2;
           }
         }



return str;

    }
}