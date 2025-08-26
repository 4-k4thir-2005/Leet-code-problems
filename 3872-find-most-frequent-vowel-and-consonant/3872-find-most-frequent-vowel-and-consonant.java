class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        s=s.toLowerCase();
       Map<Character,Integer>vowel=new HashMap<>();
       Map<Character,Integer>consonant=new HashMap<>();
       for(char ch:s.toCharArray()){
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowel.put(ch,vowel.getOrDefault(ch,0)+1);
         }  
         else if(Character.isLetter(ch)){
            consonant.put(ch,consonant.getOrDefault(ch,0)+1);
         }
       }
       int max1=vowel.isEmpty()?0:Collections.max(vowel.values());
       int max2=consonant.isEmpty()?0:Collections.max(consonant.values());
       return max1+max2;
    }
}