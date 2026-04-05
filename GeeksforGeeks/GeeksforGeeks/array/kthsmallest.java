//time complexity O(n log n)
//space complexity O(n)


class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue < Integer> minHeap = new PriorityQueue<>();
        
        for(int num : arr){
            minHeap.add(num);
        }
        
        for(int i=1 ; i<k ; i++){
            minHeap.poll();
        }
        
        return minHeap.poll();
    }
}
