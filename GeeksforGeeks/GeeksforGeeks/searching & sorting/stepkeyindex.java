// User function Template for Java
//time complexity O(n/k)
//space complexity O(1)


class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
        int i = 0;
        
        while(i<arr.length){
            if(arr[i] == x){
                return i;
            }
            
            int diff = Math.abs(arr[i]-x);
            int step = Math.max(1,diff/k);
            
            i = i+step;
        }
        return -1;
    }
}