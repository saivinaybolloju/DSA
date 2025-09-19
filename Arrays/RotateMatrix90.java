//https://leetcode.com/problems/rotate-image/description/

class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[i].clone();
        }

        int k=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[j][k]=temp[i][j];
            }
            k--;
        }
    }
}
