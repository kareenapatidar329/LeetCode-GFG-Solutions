//time complexity O(n)
//space complexity O(1)


class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int [26];
        int start = 0;
        int maxCount = 0;
        int maxLen = 0;

        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            freq[ch-'A']++;

            maxCount = Math.max(maxCount , freq[ch - 'A']);

            while((end-start + 1) - maxCount > k){
                freq[s.charAt(start)-'A']--;
                start ++;
            }
            maxLen = Math.max(maxLen , end - start +1);

        }
        return maxLen;
    }
}