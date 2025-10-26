class Solution {
    public boolean checkValid(int[][] mat) {
        int n=mat.length;
        for(int a[]:mat){
            for(int i=0;i<a.length-1;i++){
               for(int j=0;j<a.length;j++){
                if(i!=j && a[i]==a[j]){
                    return false;
                }
               }
            }
        }
             for (int col = 0; col < n; col++) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (mat[i][col] == mat[j][col]) {
                        return false; 
                    }
                }
            }
        }
        return true;
    }
}