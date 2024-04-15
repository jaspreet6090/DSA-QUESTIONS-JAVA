

public class CheckSortedArray {
  public static int isSorted(int n, int []a) {
    int i = 0;
    int j=n-1;

    while(i<n/2 && j >=n/2){
        if(a[i] <= a[j]){
            i++;
            j--;
        } else{
            return 0;
        }
    }
    return 1;
 }
}
