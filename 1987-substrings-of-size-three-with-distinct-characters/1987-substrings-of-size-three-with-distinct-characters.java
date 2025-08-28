class Solution {
    public int countGoodSubstrings(String s) {
      int n=s.length();
      List<String>list=new ArrayList<>();
      for(int i=0;i<=n-3;i++){
          list.add(s.substring(i,i+3));
      }
      int count=0;
      for(int i=0;i<list.size();i++){
        String sub=list.get(i);
        Map<Character,Integer>map=new HashMap<>();
        for(int j=0;j<sub.length();j++){
         char ch=sub.charAt(j);
         map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size()==3){
            count++;
        }
      }
      return count;
    }
}