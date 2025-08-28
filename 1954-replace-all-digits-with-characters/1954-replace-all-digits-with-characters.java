class Solution {
    public String replaceDigits(String s) {
    int n=s.length();
    String res="";
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
           int num=Character.getNumericValue(ch);
           int n1=(int)s.charAt(i-1);
           int sum=n1+num;
           res+=(char)sum;
        }
        else{
            res+=ch;
        }
     }
     return res;
    }
}