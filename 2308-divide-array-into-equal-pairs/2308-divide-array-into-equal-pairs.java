class Solution {
    public boolean divideArray(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        int n=nums.length;
        int pair=n/2;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            List<Integer>res=new ArrayList<>();
            res.add(nums[i]);
            res.add(nums[i+1]);
            if(nums[i]!=nums[i+1]){
                return false;
            }
            list.add(res);
        }
        return true;
    }
}