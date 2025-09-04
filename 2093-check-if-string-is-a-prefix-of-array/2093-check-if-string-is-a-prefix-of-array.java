class Solution {
    public boolean isPrefixString(String s, String[] words) {
      String res="";
      for(String i:words){
        res+=i;
        if(s.equals(res)){
            return true;
        }
      }
      return false;
    }
}