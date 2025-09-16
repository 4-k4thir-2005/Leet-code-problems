class Solution {
    public boolean checkAlmostEquivalent(String s1, String s2) {
      if(s1.length()!=s2.length()) return false;
      Map<Character,Integer>map1=new HashMap<>();
      for(char ch:s1.toCharArray()){
        map1.put(ch,map1.getOrDefault(ch,0)+1);
      }
      Map<Character,Integer>map2=new HashMap<>();
      for(char ch:s2.toCharArray()){
        map2.put(ch,map2.getOrDefault(ch,0)+1);
      }
      for(char c='a';c<='z';c++){
        int count1=map1.getOrDefault(c,0);
        int count2=map2.getOrDefault(c,0);
        if(Math.abs(count1-count2)>3) return false;
      }
      return true;
    }
}