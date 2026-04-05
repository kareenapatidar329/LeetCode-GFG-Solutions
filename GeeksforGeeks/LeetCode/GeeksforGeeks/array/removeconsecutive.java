// User function Template for Java
//time complexity(n)
//space complexity(n)


class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder result = new StringBuilder ();
        result.append(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}