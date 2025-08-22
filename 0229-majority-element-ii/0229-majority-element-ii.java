class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) map.put(x, map.getOrDefault(x, 0) + 1);

        int threshold = nums.length / 3;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > threshold) res.add(e.getKey());
        }
        return res;
    }
}
