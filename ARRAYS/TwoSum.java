import java.util.HashMap;

public class TwoSum {
  public static String read(int n, int []book, int target){
    HashMap<Integer, Integer> numIndexMap = new HashMap<>();
       
       for (int i = 0; i < n; i++) {
           int complement = target - book[i];
           if (numIndexMap.containsKey(complement)) {
               return "YES";
           }
           numIndexMap.put(book[i], i);
       }
       
       return "NO"; // If no solution found
   }
}
