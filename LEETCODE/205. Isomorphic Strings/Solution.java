import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
       
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        int length =  s.length();
        for (int i = 0; i < length; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if ((sToT.containsKey(charS) && sToT.get(charS) != charT) || 
                (tToS.containsKey(charT) && tToS.get(charT) != charS)) {
                return false;
            }

            sToT.put(charS, charT);
            tToS.put(charT, charS);
        }

        return true;
    }
}