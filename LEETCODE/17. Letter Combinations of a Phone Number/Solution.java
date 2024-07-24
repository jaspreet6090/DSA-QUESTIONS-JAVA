class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) return ans;

        String value = "";
        String [] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits, 0,map, value, ans);
        return ans;
    }

    public void solve(String digits, int index,String [] map, String value, List<String> ans){
        //base case
        if(index == digits.length()){
            ans.add(value);
            return;
        }

        //task
        int num = digits.charAt(index) - '0';  //to find actual number
        String letters = map[num];

        for(int i=0; i<letters.length(); i++){
            value+=letters.charAt(i);
            solve(digits, index+1,map, value, ans);
            value= value.substring(0,value.length()-1);
        }

    }
}