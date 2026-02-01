//time complexity O(n)
//space complexity O(1)


class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] freqT = new int[128];   // frequency of characters in t
        int[] freqS = new int[128];   // frequency in current window

        // store frequency of t
        for (char c : t.toCharArray()) {
            freqT[c]++;
        }

        int left = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freqS[c]++;

            if (freqT[c] != 0 && freqS[c] <= freqT[c]) {
                count++;
            }

            while (count == t.length()) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                freqS[leftChar]--;

                if (freqT[leftChar] != 0 && freqS[leftChar] < freqT[leftChar]) {
                    count--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(startIndex, startIndex + minLen);
    }
}

