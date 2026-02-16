//time complexity O(n log n)
//space complexity O(1)


class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int num : nums){
            heap.add(num);

            if(heap.size() > k){
                heap.poll();
            }

        }
        return heap.peek();
    }
}