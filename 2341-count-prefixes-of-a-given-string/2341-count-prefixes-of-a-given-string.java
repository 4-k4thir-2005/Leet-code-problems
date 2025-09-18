class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String k:words){
            if(s.startsWith(k)){
                count++;
            }
        }
        return count;
    }
}