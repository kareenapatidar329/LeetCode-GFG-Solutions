//time complexity O(n)
//space complexity O(n)



class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap < Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int x : map.keySet()){
            if(map.get(x)>arr.length/2){
                return x;
            }
        }
        return -1;
    }
}