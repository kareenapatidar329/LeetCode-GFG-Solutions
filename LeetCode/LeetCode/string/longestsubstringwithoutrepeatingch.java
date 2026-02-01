//time complexity O(n)
//space complexityO(1)



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        int[] lastIndex = new int [256];

        for(int i=0; i<256; i++){
            lastIndex[i] = -1;


        }
        int start = 0;
        for(int end = 0; end<n; end++){
            char ch = s.charAt(end);
            if(lastIndex[ch] >= start){
                start = lastIndex[ch] + 1;

            }
            lastIndex[ch] = end;
            maxlen = Math.max(maxlen , end-start+1);
        }
        return maxlen;
        
    }
}