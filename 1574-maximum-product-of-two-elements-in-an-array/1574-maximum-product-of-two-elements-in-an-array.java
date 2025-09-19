class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j){
                    int pro=(nums[i]-1)*(nums[j]-1);
                        if(pro>max){
                            max=pro;
                        }
                    }
                }
            }
        
        return max;
    }
}