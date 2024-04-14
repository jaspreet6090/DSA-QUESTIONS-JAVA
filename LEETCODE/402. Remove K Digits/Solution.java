class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0;
        int count = 0;

        System.out.println(tickets.length);

        while (tickets[k] != 0) {
            if (i <= tickets.length - 1) {
                if (tickets[i] == 0) {
                    i++;
                } else {
                    tickets[i]--;
                    class Solution {
                        public String removeKdigits(String num, int k) {

                            int len = num.length();
                            if (k == len) {
                                return "0";
                            }

                            Stack<Character> stack = new Stack<>();
                            int i = 0;
                            while (i < num.length()) {
                                while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                                    stack.pop();
                                    k--;
                                }
                                stack.push(num.charAt(i));
                                i++;
                            }

                            while (k > 0) {
                                stack.pop();
                                k--;
                            }

                            StringBuilder sb = new StringBuilder();
                            while (!stack.isEmpty()) {
                                sb.append(stack.pop());
                            }
                            sb.reverse();

                            while (sb.length() > 1 && sb.charAt(0) == '0') {
                                sb.deleteCharAt(0);
                            }

                            return sb.toString();

                            // SOL 01
                            // Stack <Character> stack = new Stack<>();

                            // for (int i =0;i< num.length() ; i++){
                            // char ch = num.charAt(i);
                            // while(!stack.isEmpty() && k > 0 && stack.peek() > ch){
                            // stack.pop();
                            // k--;
                            // }
                            // stack.push(ch);
                            // }

                            // StringBuilder sb = new StringBuilder();
                            // while(!stack.isEmpty()){
                            // if(k>0){
                            // stack.pop();
                            // k--;
                            // }else{
                            // sb.insert(0,stack.pop());
                            // }
                            // }

                            // while(sb.length() > 0 && sb.charAt(0) == '0' ){
                            // sb.deleteCharAt(0);
                            // }

                            // return (sb.length() == 0) ? "0" : sb.toString();
                        }
                    }
                    count++;
                    i++;
                }
            } else {
                i = 0;
            }

        }
        return count;
    }
}

// class Solution {
// public int timeRequiredToBuy(int[] tickets, int k) {
// int ele=tickets[k];
// int out=0;
// for(int i=0;i<tickets.length;i++) {
// if(tickets[i]>=ele) {
// if(i<=k)
// out=out+ele;
// else
// out=out+ele-1;
// }
// else {
// out=out+tickets[i];
// }
// }
// return out;
// }
// }
