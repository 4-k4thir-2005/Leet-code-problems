class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      int n=nums.length;
      List<Integer>list=new ArrayList<>();
      for(int i=0;i<n;i++){
        list.add(index[i],nums[i]);
      }
      int res[]=new int[list.size()];
      int index1=0;
      for(int k:list){
        res[index1++]=k;
      }
        return res;
    }
}