class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=0;
       int len1=s.length();
       int len2=t.length();
       for(int i=0;i<len2 && index<len1;i++){
        if(s.charAt(index)==t.charAt(i)){
            index++;
        }
       }
       return index==len1;
    }
}