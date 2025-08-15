class Solution {
    public 
    int[] singleNumber(int[] nums) {
        Set<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            if(set.contains(i)){
                 list.remove(Integer.valueOf(i));
            }
            else{
                  set.add(i);
                  list.add(i);
            }
           
        }
        int arr[]=new int[list.size()];
        int index=0;
        for(int k:list){
         arr[index++]=k;
        }
        return arr;
        
    }
}