class Solution {
    public int search(int[] nums, int target) {
     int n=nums.length;
     int index=-1;
     for(int i=0;i<n;i++){
        if(nums[i]==target){
            index=i;
        }
     }
     return index;
    }
}