//time complexity O(n)
//space complexity O(1)


class Solution {
    public static String countSort(String s) {
        // code here
        int [] freq = new int [26];
        
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            
        }
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<26; i++){
            while(freq[i] >0){
                result.append((char) (i+'a'));
                freq[i]--;
            }
        }
        return result.toString();
    }
}