class Solution {
    public int findSpecialInteger(int[] arr) {
     Map<Integer,Integer>map=new HashMap<>();
     for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
     }
     int  max=Collections.max(map.values());
     for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        if(entry.getValue()==max){
            return entry.getKey();
        }
     }
     return -1;
    }
}