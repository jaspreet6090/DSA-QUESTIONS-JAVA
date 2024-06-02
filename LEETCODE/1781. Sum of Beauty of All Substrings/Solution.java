class Solution {
    public static int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        for (int i = 0; i < n; i++) {
            int[] charCount = new int[26]; // Array to store the frequency of each character

            for (int j = i; j < n; j++) {
                charCount[s.charAt(j) - 'a']++; // Increment the frequency of the character

                // Calculate the beauty of the current substring
                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;
                for (int freq : charCount) {
                    if (freq > 0) {
                        maxFreq = Math.max(maxFreq, freq);
                        minFreq = Math.min(minFreq, freq);
                    }
                }
                int beauty = maxFreq - minFreq;
                totalBeauty += beauty;
            }
        }

        return totalBeauty;
    }
}