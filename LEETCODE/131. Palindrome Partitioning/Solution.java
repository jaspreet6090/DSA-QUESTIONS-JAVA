class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(s,0,path,result);
        return result;
    }

    public void func(String s,int idx, List<String> path, List<List<String>> result){
        int n = s.length();

        //base case
        if(idx == n){
            result.add(new ArrayList<>(path));
            return;
        }

        //task
        for(int i=idx; i<n; i++){
            if(isPalindrome(s,idx,i)){
                path.add(s.substring(idx,i+1));
                func(s,i+1,path,result);
                path.remove(path.size()-1);
            }
        } 
    }

    public boolean isPalindrome(String s,int i1,int i2){
        while(i1 <= i2){
            if(s.charAt(i1) != s.charAt(i2)){
                return false;
            }
            i1++;
            i2--;
        }

        return true;
    }
}