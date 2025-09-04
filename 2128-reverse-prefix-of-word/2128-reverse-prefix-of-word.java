class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                s.append(word.substring(0,i+1));
                s.reverse();
                s.append(word.substring(i+1));
                return s.toString();
            }
        }
        return word;
    }
}