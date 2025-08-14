class Solution {
    public int countConsistentStrings(String str, String[] words) {
    int count=0;
    for(String s:words ){
        boolean con=true;
        for(char ch:s.toCharArray()){
         if(str.indexOf(ch)==-1){
            con=false;
          }
        }
        if(con)
        count++;
      }
      return count;
    }
}