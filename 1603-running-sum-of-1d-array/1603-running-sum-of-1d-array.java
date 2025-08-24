class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int index=0;
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=nums[i];
          arr[index++]=sum;
        }
        return arr;
    }
}