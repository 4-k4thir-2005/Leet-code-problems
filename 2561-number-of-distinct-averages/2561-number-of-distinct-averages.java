class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        if(n<=2) return 1;
        Set<Double>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        // int j=0;
        while(!list.isEmpty()){
        int min=Collections.min(list);
        int max=Collections.max(list);
        double res=(min+max)/2.0;
        set.add(res);
        list.remove(Integer.valueOf(min));
        list.remove(Integer.valueOf(max));        
        }
        return set.size();
    }
}