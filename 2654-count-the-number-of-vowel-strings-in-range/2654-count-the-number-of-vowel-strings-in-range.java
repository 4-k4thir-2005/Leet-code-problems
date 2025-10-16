class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String s="aeiou";
        int count=0;
        for(int i=left;i<=right;i++){
          String str=words[i];
          char start=str.charAt(0);
          char  end=str.charAt(str.length()-1);
          if(s.indexOf(start)!=-1 && s.indexOf(end)!=-1){
            count++;
          }
        }
        return count;
    }
}