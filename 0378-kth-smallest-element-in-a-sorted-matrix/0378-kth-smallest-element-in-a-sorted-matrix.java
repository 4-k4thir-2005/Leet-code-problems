class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    int row=matrix.length;
    int col=matrix[0].length;
    List<Integer>list=new ArrayList<>();
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            list.add(matrix[i][j]);
        }
      }
      Collections.sort(list);
      return list.get(k-1);
    }
}