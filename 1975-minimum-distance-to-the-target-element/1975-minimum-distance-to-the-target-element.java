class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minabs=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
             int ans=Math.abs(i-start);
              if(ans<minabs){
                minabs=ans;
              }
            }
        }
        return minabs;
    }
}