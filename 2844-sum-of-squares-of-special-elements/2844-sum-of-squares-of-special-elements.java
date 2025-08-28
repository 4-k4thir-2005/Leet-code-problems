class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                list.add(nums[i]);
            }
        }
        int sum=0;
        for(int k:list){
             int mul=k*k;
             sum+=mul;
        }
        return sum;
    }
}