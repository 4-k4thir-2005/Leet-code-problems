class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer>rep=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rep.put(grid[i][j],rep.getOrDefault(grid[i][j],0)+1);
            }
        }
        int repeated=-1,missing=-1;
        for(int i=1;i<=n*n;i++){
            if(!rep.containsKey(i)){
                missing=i;
            }
            else if(rep.get(i)==2){
                repeated=i;
            }
        }
    return new int[]{repeated,missing};
    }
}