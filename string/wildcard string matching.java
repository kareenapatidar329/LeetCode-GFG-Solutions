// User function Template for Java
//time complexity O(n*m)
//space complexity O(n*m)


class Solution {
    static boolean match(String wild, String pattern) {
        // code here
        
        int n = wild.length();
        int m = pattern.length();

        // dp[i][j] = true if wild ke first i characters
        // pattern ke first j characters se match karte hain
        boolean[][] dp = new boolean[n + 1][m + 1];

        // Empty wild aur empty pattern match karte hain
        dp[0][0] = true;

        // Agar pattern empty hai aur wild me sirf '*' hai
        for (int i = 1; i <= n; i++) {
            if (wild.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }

        // DP fill karna
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                char w = wild.charAt(i - 1);
                char p = pattern.charAt(j - 1);

                if (w == p || w == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if (w == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
                else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }
}
