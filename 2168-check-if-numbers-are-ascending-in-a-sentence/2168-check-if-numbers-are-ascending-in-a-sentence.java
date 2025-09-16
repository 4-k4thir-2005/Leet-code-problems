class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                list.add(num);
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < list.size() - 1; j++) {
            if (list.get(j) >= list.get(j + 1)) {
                return false;
            }
        }
        return true;
    }
}
