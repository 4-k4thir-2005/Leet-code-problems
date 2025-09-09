class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        while (list.size() < k) {
            int max = Collections.max(map.values());  
            List<String> temp = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    temp.add(entry.getKey());
                }
            }
            Collections.sort(temp);

            for (String t : temp) {
                if (list.size() < k) {
                    list.add(t);
                }
            }
            for (String t : temp) {
                map.remove(t);
            }
        }

        return list;
    }
}
