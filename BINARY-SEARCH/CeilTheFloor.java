

public class CeilTheFloor {
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {

        int low = 0;
        int high = n -1;
        int largest = -1;
        int smallest = -1;
        
        while(low <= high){
            int mid = (low + high ) /2;
             if(arr[mid] == x){
                return new int[]{arr[mid], arr[mid]};
            }
            if(arr[mid] >=  x){
                largest = arr[mid];
                high = mid-1;
            }
            else if (arr[mid] <= x){
                smallest = arr[mid];
                low = mid+1;
            }
        }
        
        return new int[]{smallest,largest};
    }
}

