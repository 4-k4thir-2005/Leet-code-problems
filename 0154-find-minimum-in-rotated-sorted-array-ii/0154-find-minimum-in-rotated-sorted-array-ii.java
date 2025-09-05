class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<min){
                min=i;
            }
        }
        return min;
        // Set<Integer>set=new HashSet<>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // return Collections.min(set);
    }
}