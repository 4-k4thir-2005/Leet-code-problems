class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int lastpos=-1;
        int maxdis=0;
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
             if(ch=='1'){
                if(lastpos!=-1){
                    maxdis=Math.max(maxdis,i-lastpos);
                }
                lastpos=i;
             }
           }
        return maxdis;
    }
}