class Solution {
    public boolean isBalanced(String num) {
     char []ch=num.toCharArray();
      int evensum=0;
      int oddsum=0;
      for(int i=0;i<ch.length;i++){
         if(i%2!=0){
            int n=Character.getNumericValue(ch[i]);
            oddsum+=n;
         }
         else{
             int n=Character.getNumericValue(ch[i]);
             evensum+=n;
         }
      }
      return oddsum==evensum;
    }
}