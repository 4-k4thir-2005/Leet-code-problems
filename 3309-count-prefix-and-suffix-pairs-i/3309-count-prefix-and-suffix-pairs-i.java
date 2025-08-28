class Solution {
    public int countPrefixSuffixPairs(String[] words) {
  int n=words.length;
  int count=0;
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(countpair(words[i],words[j])){
                count++;
            }
        }
     }
     return count;
    }
    static boolean countpair(String a,String b){
     return b.startsWith(a)&&b.endsWith(a);
    }
}