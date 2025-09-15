class Solution {
    public long zeroFilledSubarray(int[] nums) {
    long sum = 0,zero=0;
    for(int num:nums){
        if(num==0){
            zero++;
            sum+=zero;
        }
        else {
            zero=0;
        }
     }
     return sum;
    }
}