class Solution {
    public boolean checkValidString(String s) {

        int omin=0;
        int omax=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                omax++;
                omin++;
            }
            else if(s.charAt(i)==')'){
                omax--;
                omin--;
            }
            else{
                omax++;
                omin--;
            }
            if(omax<0){
                return false;
            }
            omin=Math.max(0,omin);
        }
        return omin==0;
     
        //  Stack<Integer> open= new Stack<Integer>();
        //   Stack<Integer> star = new Stack<Integer>();   
      
        // int len = s.length();

        // for(int i =0 ; i<len;i++){
        //    char ch = s.charAt(i);
           
        //     if(ch == '('){
        //         open.push(i);
        //     } else if(ch == '*'){
        //         star.push(i);
        //     } else{
        //         if(!open.empty()){
        //             open.pop();
        //         }else if (!star.empty()){
        //             star.pop();

        //         } else{
        //             return false;
        //         }
        //     }
        //     //till now our closing bracket are done
        // }
        // while(!open.empty()){
        //     if(star.empty()){
        //         return false;
        //     } else if(open.peek() < star.peek()){
        //         open.pop();
        //         star.pop();
        //     }
        //     else{
        //         return false;
        //     }
           
        // }
        //  return true;
    }
}