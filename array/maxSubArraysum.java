//time complexity O(n)
//space complexity O(1)
// approach = kadane's Algorithm 
// MaxSubArray sum





class Solution {
    public int maxSubArray(int[] nums) {
       int currentSum = nums[0];
       int maxSum = nums[0];

       for(int i=1; i<nums.length; i++){
        currentSum = Math.max(nums[i] , currentSum + nums[i]);
        maxSum = Math.max(maxSum , currentSum);

       }

       return maxSum;
    }
}