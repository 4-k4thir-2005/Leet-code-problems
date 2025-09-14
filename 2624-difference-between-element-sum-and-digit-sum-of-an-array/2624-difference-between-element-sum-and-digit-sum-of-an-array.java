class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        for(int i:nums){
            sum1+=i;
        }
        int sum2=0;
        for(int i:nums){
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                 sum2+=rem;
                 temp/=10;
            }
        }
        return Math.abs(sum1-sum2);
    }
}