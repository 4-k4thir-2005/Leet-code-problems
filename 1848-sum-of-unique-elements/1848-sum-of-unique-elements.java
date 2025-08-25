class Solution {
    public int sumOfUnique(int[] nums) {
      Map<Integer,Integer>map=new HashMap<>();
      for(int k:nums){
        map.put(k,map.getOrDefault(k,0)+1);
      }
      int sum=0;
        for(int key:map.keySet()){
            if(map.get(key)==1){
              sum+=key;
            }
        }
      
      return sum;
    }
}