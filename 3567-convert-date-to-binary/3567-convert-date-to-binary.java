class Solution {
    public String convertDateToBinary(String date) {
     String s[]=date.split("-");
     StringBuilder tar=new StringBuilder();
      for(int i=0;i<s.length;i++){
        int num=Integer.parseInt(s[i]);
        String res=Integer.toBinaryString(num);
        tar.append(res);
        if(i!=s.length-1){
            tar.append("-");
        }
      }
      return tar.toString();
    }
}