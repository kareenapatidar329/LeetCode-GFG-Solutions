//time complexity O(n)
//space complexity O(1)


class Solution {
    public int trap(int[] height) {
    
        int left = 0;                     // left pointer
        int right = height.length - 1;    // right pointer

        int leftMax = 0, rightMax = 0;    // left aur right side ke max walls
        int water = 0;                    // total trapped water

        while (left < right) {

            if (height[left] <= height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];   // new left max update
                } else {
                    water += leftMax - height[left];  // water add
                }
                left++;   // move left pointer

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right]; // new right max update
                } else {
                    water += rightMax - height[right]; // water add
                }
                right--;  // move right pointer
            }
        }

        return water;   // final trapped water
    }
}

   