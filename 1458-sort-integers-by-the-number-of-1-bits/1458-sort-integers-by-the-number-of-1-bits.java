import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] res = new int[n];
        boolean[] used = new boolean[n];
        int index = 0;
        for (int bitCount = 0; bitCount <= 32; bitCount++) {
            for (int i = 0; i < n; i++) {
                if (!used[i] && Integer.bitCount(arr[i]) == bitCount) {
                    res[index++] = arr[i];
                    used[i] = true;
                }
            }
        }
        return res;
    }
}
