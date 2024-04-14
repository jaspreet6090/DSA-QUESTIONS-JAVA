class Solution {
  public int lengthOfLastWord(String s) {
      int count = 0;
     
      String newS = s.trim();
      int length = newS.length();
      
      
       if(newS.length() == 1){
          count++;
       }else{
           while(length >0 && newS.charAt(length-1)!=' '  ){
          
          count++;
          length--;
           }
       }
       return count;
  }
}