class Solution {
    public int[] shuffle(int[] nums, int n) {
     List<Integer>list1=new ArrayList<>();
     List<Integer>list2=new ArrayList<>();
     for(int i=0;i<n;i++){
        list1.add(nums[i]);
     }
     for(int i=n;i<nums.length;i++){
        list2.add(nums[i]);
     }
     int res[]=new int[nums.length];
     for(int i=0;i<list1.size();i++){
        res[i*2]=list1.get(i);
     }
    int index=1;
    for(int k:list2){
        res[index]=k;
        index+=2;
    }
     return res;
    }
}