// User function Template for Java
//time complexity O(n)
//space complexity O(1)

class Solution {
    int transform(String A, String B) {
        // code her
        if (A.length() != B.length()) return -1;

        int n = A.length();

        // Frequency check
        int[] freq = new int[256];
        for (int i = 0; i < n; i++) {
            freq[A.charAt(i)]++;
            freq[B.charAt(i)]--;
        }

        for (int f : freq) {
            if (f != 0) return -1;
        }

        int i = n - 1, j = n - 1;
        int operations = 0;

        while (i >= 0) {
            if (A.charAt(i) == B.charAt(j)) {
                i--;
                j--;
            } else {
                // Move A[i] to front
                operations++;
                i--;
            }
        }

        return operations;
    }
}
