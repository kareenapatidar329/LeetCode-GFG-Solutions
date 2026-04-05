//time complexity O(n)
//space complexity O(1)

class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n = arr.length;
        
        int pivot = -1;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                pivot = i;
                break;
            }
        }
        
        if (pivot == -1){
            int left = 0 , right = n-1;
        
        
        while(left < right){
            
            int sum = arr[left] + arr[right];
            
            if(sum == target)
              return true;
              
            else if(sum < target)
              left ++ ;
            else
              right --;
              
        }
        return false;
    }
    
    int left = (pivot + 1) % n;
    int right = pivot;
    
    while(left != right){
        int sum = arr[left] + arr[right];
        
        if(sum == target)
            return true;
            
        if (sum < target)
            left = (left + 1) % n;
        else
            right = (n + right-1) % n;
    }
    return false;
    }
}
