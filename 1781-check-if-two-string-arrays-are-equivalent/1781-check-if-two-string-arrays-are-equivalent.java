class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n=word1.length;
        int m=word2.length;
        String s1="";
        String s2="";
        for(int i=0;i<n;i++){
            s1+=word1[i];
        }
        for(int j=0;j<m;j++){
            s2+=word2[j];
        }
        boolean res=false;
        if(s1.equals(s2)){
            res=true;
        }
        return res;
    }
}