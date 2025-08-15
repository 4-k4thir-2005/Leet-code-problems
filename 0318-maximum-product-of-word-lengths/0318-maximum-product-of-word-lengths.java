class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];
        int[] len = new int[n];

        // Step 1: Precompute bitmask for each word
        for (int i = 0; i < n; i++) {
            int bit = 0;
            for (char ch : words[i].toCharArray()) {
                bit |= 1 << (ch - 'a'); // Set the bit for each letter
            }
            mask[i] = bit;
            len[i] = words[i].length();
        }

        int max = 0;

        // Step 2: Compare all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((mask[i] & mask[j]) == 0) { // No common letter
                    max = Math.max(max, len[i] * len[j]);
                }
            }
        }

        return max;
    }
}
