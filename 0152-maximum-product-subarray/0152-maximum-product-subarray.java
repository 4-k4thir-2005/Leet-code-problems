class Solution {
    public int maxProduct(int[] nums) {
      int n=nums.length;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        int pro=1;
        for(int j=i;j<n;j++){
            pro*=nums[j];
            if(pro>max){
                max=pro;
            }
        }
      }
      return max;
    }
}