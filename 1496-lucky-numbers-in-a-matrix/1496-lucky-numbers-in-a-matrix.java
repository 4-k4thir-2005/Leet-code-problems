class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<row;i++){
             int min=matrix[i][0];
             int index=0;
            for(int j=0;j<col;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            boolean res=true;
            for(int k=0;k<row;k++){
                if(matrix[k][index]>min){
                    res=false;
                    break;
                }
            }
            if(res){
                list.add(min);
            }
        }
        return list;
    }
}