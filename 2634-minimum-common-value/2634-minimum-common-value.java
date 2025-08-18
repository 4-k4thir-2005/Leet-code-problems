class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        List<Integer>list=new ArrayList<>();
        for(int j:nums2){
            if(set.contains(j)){
                list.add(j);
            }
        }
        if(list.isEmpty()){
            return -1;
        }
        int min=Collections.min(list);
        return min;
    }
}