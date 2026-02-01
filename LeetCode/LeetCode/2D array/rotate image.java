//time complexity O(n^2)
//space complexity O(1)


class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        for(int i = 0; i< matrix.length; i++){
            for(int j = i+1 ; j< matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-1-j];
                matrix[i][length-1-j] = temp;
            }
        }
    }
}