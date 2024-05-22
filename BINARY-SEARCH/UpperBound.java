// You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.

// Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.

public class UpperBound {
  public static int upperBound(int []arr, int x, int n){
     int low = 0;
      int high = n-1;
      int ans = n;
  
 while (low <= high) {
  int mid = low + (high-low) / 2;
  
  if (arr[mid] > x) {
      ans = mid;
      high = mid - 1; // Corrected logic to find the rightmost element
  } else {
      low = mid + 1;
  }
}
return ans;
  }
}
