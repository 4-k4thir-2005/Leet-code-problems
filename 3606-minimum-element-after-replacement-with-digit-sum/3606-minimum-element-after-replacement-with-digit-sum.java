class Solution {
    public int minElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            int temp=i;
            int sum=0;
            while(temp>0){
                int rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            list.add(sum);
        }
        return Collections.min(list);
    }
}