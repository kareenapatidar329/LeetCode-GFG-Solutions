//time complexity O(n^2)
//space complexity O(1)


class Solution {
    public int countSubstrings(String s) {
        int totalCount = 0;
        for(int i=0 ; i<s.length(); i++){
           totalCount += countPalindrome(s,i,i);
           totalCount += countPalindrome(s,i,i+1);
        }
        return totalCount;
    }
    private int countPalindrome(String str , int start , int end){
        int count = 0;
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }
}