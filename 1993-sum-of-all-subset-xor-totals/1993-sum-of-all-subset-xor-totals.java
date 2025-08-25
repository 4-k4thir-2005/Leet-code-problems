
class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 1 << n;
        int sum = 0;

        for (int i = 0; i < total; i++) {
            int xorVal = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // if j-th bit is set in i
                    xorVal ^= nums[j];
                }
            }
            sum += xorVal;
        }

        return sum;
    }
}
