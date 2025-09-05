class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                list.add(sum);
            }
        }
        Collections.sort(list);
        int sum1=0;
        for(int i=left-1;i<right;i++){
            int MOD = 1_000_000_007;
sum1 = (sum1 + list.get(i)) % MOD;

        }
        return sum1;
    }
}