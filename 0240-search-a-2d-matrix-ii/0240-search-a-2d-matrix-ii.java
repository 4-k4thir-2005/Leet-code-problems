class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row=matrix.length;
    int col=matrix[0].length;
    boolean res=false;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
           if(matrix[i][j]==target){
            res=true;
           }
        }
      }
      return res;
    }
}