class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int k:nums){
            min=Math.min(min,k);
        }
        return min;
    }
}