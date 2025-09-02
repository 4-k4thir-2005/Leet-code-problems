class Solution {
    public int smallestIndex(int[] nums) {
       int n=nums.length;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        int sum=0;
         int num=nums[i];
         while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
         }
         if(sum==i){
               min=Math.min(min,i);
         }
       } 
       return min==Integer.MAX_VALUE?-1:min;
    }
}