//time complexity O(n)
//space complexity O(n)


class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        
        if(x<0) x= -x;
        
        HashSet <Integer> set = new HashSet<>();
        
        for (int num: arr){
            if(x == 0){
                if(set.contains(num)){
                    return true;
                }
                set.add(num);
            }
            else{
                if(set.contains(num+x) || set.contains(num-x)){
                    return true;
                }
                set.add(num);
            }
            
        }
        
        return false;
       
    }
}