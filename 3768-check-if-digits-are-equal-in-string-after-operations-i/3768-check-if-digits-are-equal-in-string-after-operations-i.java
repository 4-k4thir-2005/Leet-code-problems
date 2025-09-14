class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int num1=Character.getNumericValue(s.charAt(i));
             int num2=Character.getNumericValue(s.charAt(i+1));
             int res=(num1+num2)%10;
             sb.append(res);
        }
        s=sb.toString();
      }
      return  s.charAt(0)==s.charAt(1);
    }
}