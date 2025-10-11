class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int totalsum=0;
        int n=nums.length;
        for(int k:nums){
          totalsum+=k;
        }
       int leftsum=0;
       for(int i=0;i<n-1;i++){
        leftsum+=nums[i];
        int rightsum=totalsum-leftsum;
        if(leftsum%2==rightsum%2){
            count++;
        }
       }
     return count;
    }
}