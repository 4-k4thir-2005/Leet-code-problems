class Solution {
    public int countDigitOne(int n) {
        if (n <= 0) return 0;

        int count = 0;
        long pos = 1; // digit place: 1, 10, 100, ...

        while (pos <= n) {
            long high = n / (pos * 10);
            long curr = (n / pos) % 10;
            long low = n % pos;

            // Count based on current digit value
            if (curr == 0) {
                count += high * pos;
            } else if (curr == 1) {
                count += high * pos + low + 1;
            } else {
                count += (high + 1) * pos;
            }

            pos *= 10; // next digit place
        }

        return count;
    }
}
