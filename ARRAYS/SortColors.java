import java.util.* ;

public class SortColors {
  public static void sortArray(ArrayList<Integer> nums, int n) {


    int low = 0;
    int high = n - 1;
    int mid = 0;

    while (mid <= high) {
        switch (nums.get(mid)) {
            case 0:
                Collections.swap(nums, low, mid);
                low++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                Collections.swap(nums, mid, high);
                high--;
                break;
        }
    }
}
}



// import java.util.* ;
// import java.io.*; 
// public class Solution {
//     public static void sortArray(ArrayList<Integer> arr, int n) {
    
//         int count0= 0; 
//         int count1 = 0;
//         int count2 = 0;


//         for(int i = 0; i<n;i++){
//             int num = arr.get(i);

//             if(num == 0) {count0++;}
//             else if(num == 1){ count1++;}
//             else{ count2++;
    
//                 }
//         }

//         for(int i=0;i<count0;i++){
//             arr.set(i,0);
       
//         }
//         for(int i=count0;i<count0+count1;i++){
//             arr.set(i ,1);
       
//         }
//          for(int i=count0+count1;i<n;i++){
//             arr.set(i,2);
       
//         }
//     }
// }

}
