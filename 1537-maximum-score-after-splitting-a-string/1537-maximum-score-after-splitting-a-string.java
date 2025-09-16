class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int maxScore = 0;

        for (int i = 0; i < n - 1; i++) {  // split before last character
            String left = s.substring(0, i + 1);  // include s[i]
            String right = s.substring(i + 1);

            int zeroCount = 0;
            for (char c : left.toCharArray()) {
                if (c == '0') zeroCount++;
            }

            int oneCount = 0;
            for (char c : right.toCharArray()) {
                if (c == '1') oneCount++;
            }

            maxScore = Math.max(maxScore, zeroCount + oneCount);
        }

        return maxScore;
    }
}
