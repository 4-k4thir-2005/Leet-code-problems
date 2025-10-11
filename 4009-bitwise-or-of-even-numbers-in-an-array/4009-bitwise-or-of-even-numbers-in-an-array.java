class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int sum=0;
        for(int k:nums){
            if(k%2==0){
                sum|=k;
            }
        }
        return sum;
    }
}