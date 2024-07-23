
public class Solution {
    public static double median(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){
            median(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        
        while(low <= high){
             int Px = low + (high-low)/2;
            int Py = (m+n+1)/2 - Px;

             int x1  = (Px == 0) ? Integer.MIN_VALUE : nums1[Px-1];
            int x3 = (Px == m) ? Integer.MAX_VALUE : nums1[Px];
            
            int x2  = (Py == 0) ?  Integer.MIN_VALUE : nums2[Py-1];
            int x4 = (Py == n) ?  Integer.MAX_VALUE : nums2[Py];


            if(x1 <= x4 && x2 <= x3){
                    if((m+n)%2 == 0)
                    return (Math.max(x1, x2) + Math.min(x3, x4))/2.0;
                else
                return Math.max(x1, x2);
            }else if(x1 > x4) {
                high = Px-1;
            } else {
                low = Px+1;
            }
        }
return -1;
    }
}

    //     ArrayList<Integer> arr = new ArrayList<>();
    //     int size = (nums1.length + nums2.length);
    //     int i = 0, j = 0;

    //     // Merge both arrays until the median position is reached
    //     while (i < nums1.length && j < nums2.length) {
    //         if (a[i] <= b[j]) {
    //             arr.add(a[i]);
    //             i++;
    //         } else {
    //             arr.add(b[j]);
    //             j++;
    //         }
    //     }

    //     // Add remaining elements from a
    //     while (i < nums1.length) {
    //         arr.add(a[i]);
    //         i++;
    //     }

    //     // Add remaining elements from b
    //     while (j < nums2.length) {
    //         arr.add(b[j]);
    //         j++;
    //     }

    //     // Calculate median
    //     double med;
    //     int mid = size / 2;
    //     if (size % 2 == 0) {
    //         med = (arr.get(mid - 1) + arr.get(mid)) / 2.0;
    //     } else {
    //         med = arr.get(mid);
    //     }
    //     return med;
    // }

    // public static void main(String[] args) {
    //     int[] a = {1, 3, 8};
    //     int[] b = {7, 9, 10, 11};
    //     System.out.println(median(a, b)); // Output should be 8.0



