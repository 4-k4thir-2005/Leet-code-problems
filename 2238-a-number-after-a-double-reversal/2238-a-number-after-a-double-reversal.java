class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        String s = String.valueOf(num);
        String reversedOnce = new StringBuilder(s).reverse().toString();
        int reversedInt = Integer.parseInt(reversedOnce);
        String reversedTwice = new StringBuilder(String.valueOf(reversedInt)).reverse().toString();
        int reversedTwiceInt = Integer.parseInt(reversedTwice);
        return reversedTwiceInt == num;
    }
}
