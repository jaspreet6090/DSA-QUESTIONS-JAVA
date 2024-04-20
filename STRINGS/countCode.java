public class countCode {
  public int countCode(String str) {
    int count = 0;
           for (int i = 0; i < str.length() - 3; i++) {
               if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && 
                   str.charAt(i+3) >= 'a' && str.charAt(i+3) <= 'z') {
                   count++;
               }
           }
           return count;
   }
   
}
