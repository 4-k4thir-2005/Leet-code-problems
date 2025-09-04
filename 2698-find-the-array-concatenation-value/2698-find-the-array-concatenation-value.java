class Solution {
    public long findTheArrayConcVal(int[] nums) {
    int start=0;
    int end=nums.length-1;
    long ans=0;
    String temp="";
    while(start<=end){
        if(start==end){
            temp=String.valueOf(nums[end]);
        }
        else{
            temp=String.valueOf(nums[start])+String.valueOf(nums[end]);
        }
        ans+=Integer.parseInt(temp);
        start++;
        end--;
     }
     return ans;
    }
}