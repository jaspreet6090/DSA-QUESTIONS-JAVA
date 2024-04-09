class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
          int i=0;
           int count=0;

          System.out.println(tickets.length);

             while(tickets[k] != 0 ){ 
                    if(i <= tickets.length-1){
                            if(tickets[i] == 0){
                                i++;
                            } else {
                                tickets[i]--;
                                count++;
                                i++;
                            }
                    }else {
                        i=0;
                    }

             }
             return count;
    }
}




// class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         int ele=tickets[k];
//         int out=0;
//         for(int i=0;i<tickets.length;i++) {
//             if(tickets[i]>=ele) {
//                 if(i<=k)
//                     out=out+ele;
//                 else 
//                     out=out+ele-1;    
//             }
//             else {
//                 out=out+tickets[i];
//             }
//         }
//         return out;
//     }
// }
