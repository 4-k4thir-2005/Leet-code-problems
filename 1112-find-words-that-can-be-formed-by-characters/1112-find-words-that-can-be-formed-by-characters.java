class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            String tempChars = chars;
            boolean canForm = true;
            for (int j = 0; j < s.length(); j++) {
                String a = String.valueOf(s.charAt(j));
                if (tempChars.contains(a)) {
                    tempChars = tempChars.replaceFirst(a, "");
                } else {
                    canForm = false;
                    break;
                }
            }
            if (canForm) {
                sum += s.length();
            }
        }
        return sum;
    }
}
