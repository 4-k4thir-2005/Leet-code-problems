class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        list.add(new ArrayList<>());
        int n=nums.length;
        for(int i=0;i<n;i++){
           int size=list.size();
           for(int j=0;j<size;j++){
             List<Integer>tar=new ArrayList<>(list.get(j));
                tar.add(nums[i]);
                list.add(tar);
              }
          }
        return list; 
    }
}