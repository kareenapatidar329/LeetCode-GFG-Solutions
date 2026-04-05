// User function Template for Java
//time complexity O(n1+n2+n3)
//space complexity O(1)


class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> result = new ArrayList<>();
        
        int i=0, j=0, k=0;
        
        while(i < arr1.size() && j < arr2.size() && k < arr3.size()){
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);
            
            if(a==b && b==c){
                
                if (result.size() == 0 || result.get(result.size() - 1 ) != a){
                    result.add(a);
                } 
                
                i++;
                j++;
                k++;
                
            }
            else if(a<b){
                i++;
            }
            else if(b<c){
                j++;
            
            }
            else{
                k++;
            }
        }
        return result;
    }
}