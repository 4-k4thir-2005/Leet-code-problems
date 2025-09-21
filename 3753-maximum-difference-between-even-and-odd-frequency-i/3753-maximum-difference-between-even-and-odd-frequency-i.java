import java.util.*;

class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        List<Integer> oddFreqs = new ArrayList<>();
        List<Integer> evenFreqs = new ArrayList<>();
        for (int freq : freqMap.values()) {
            if (freq % 2 == 0) {
                evenFreqs.add(freq);
            } else {
                oddFreqs.add(freq);
            }
        }
        if (oddFreqs.isEmpty() || evenFreqs.isEmpty()) {
            return -1;  
        }
        int maxDiff = Integer.MIN_VALUE;
        for (int odd : oddFreqs) {
            for (int even : evenFreqs) {
                int diff = odd - even;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    }
}
