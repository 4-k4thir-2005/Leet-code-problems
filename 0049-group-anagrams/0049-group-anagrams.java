class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
     int len = strs.length;
        List<List<String>> list1 = new ArrayList<>(); // Final list of groups
        List<String> signatures = new ArrayList<>();  // Stores sorted forms for each group

        for (int i = 0; i < len; i++) {
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch); // Sort the characters of current word
            String sortedWord = new String(ch);

            // Check if this sorted form already exists in signatures
            int index = signatures.indexOf(sortedWord);

            if (index != -1) {
                // If found, add to existing group
                list1.get(index).add(strs[i]);
            } else {
                // If not found, create new group
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                list1.add(newGroup);
                signatures.add(sortedWord);
            }
        }
       return list1;
    } 
}