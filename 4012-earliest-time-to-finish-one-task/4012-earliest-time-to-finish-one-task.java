class Solution {
    public int earliestTime(int[][] tasks) {
        List<Integer>list=new ArrayList<>();
        for(int arr[]:tasks){
            int sum=0;
            for(int i:arr){
                sum+=i;
            }
           list.add(sum);
        }
        int res=0;
        res=Collections.min(list);
     return res;
    }
}