class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value%k==0){
                while(value!=0){
                    sum+=key;
                    value--;
                }
            }
        }
        return sum;
    }
}