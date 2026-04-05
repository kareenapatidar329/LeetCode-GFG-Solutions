// User function Template for Java
//time complexity O(n*2)
//space complexity O(1)
//approach two pointer

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;
        
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            
            while(left<right){
                long currSum = arr[i]+arr[left]+arr[right];
                
                if(currSum < sum){
                    count += (right-left);
                    left++;
                }else{
                  
                right--; 
                }
            }
            
        }
        
        return count;
    }
}