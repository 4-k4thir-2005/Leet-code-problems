class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int k:arr){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int lucky=-1;
        for(int k:map.keySet()){
           int key=k;
           int value=map.get(k);
           if(key==value){
            lucky=Math.max(lucky,key);
           }
        }
      return lucky;
    }
}