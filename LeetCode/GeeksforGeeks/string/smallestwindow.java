//time complexity O(n)
//space complexity O(1)


class Solution {
    public static String smallestWindow(String s, String p) {
        // code here
        if (s.length() < p.length()) return "";

        int[] freqP = new int[256];
        int[] freqS = new int[256];

        for (char ch : p.toCharArray()) {
            freqP[ch]++;
        }

        int start = 0;
        int startIndex = -1;
        int minLen = Integer.MAX_VALUE;
        int count = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            freqS[ch]++;

            if (freqP[ch] != 0 && freqS[ch] <= freqP[ch]) {
                count++;
            }

            if (count == p.length()) {

                while (freqP[s.charAt(start)] == 0 ||
                       freqS[s.charAt(start)] > freqP[s.charAt(start)]) {

                    if (freqS[s.charAt(start)] > freqP[s.charAt(start)]) {
                        freqS[s.charAt(start)]--;
                    }
                    start++;
                }

                int len = end - start + 1;
                if (len < minLen) {
                    minLen = len;
                    startIndex = start;
                }
            }
        }

        // 🔥 GFG expects empty string if no window found
        if (startIndex == -1) return "";

        return s.substring(startIndex, startIndex + minLen);
    }
}
