class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        // int arr[] = new int[26];
        // char ch = 'a';
        // for (int i = 0; i < 26; i++) {
        //     arr[i] = ch++;
        // }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            int n1=firstWord.charAt(i)-'a';
                sb.append(n1);
        }
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < secondWord.length(); i++) {
            int n2=secondWord.charAt(i)-'a';
                sb1.append(n2);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            int n3=targetWord.charAt(i)-'a'; 
                sb2.append(n3);
            }
        String s1 = sb.toString();
        String s2 = sb1.toString();
        String s3 = sb2.toString();
        int num1 = s1.isEmpty() ? 0 : Integer.parseInt(s1);
        int num2 = s2.isEmpty() ? 0 : Integer.parseInt(s2);
        int num3 = s3.isEmpty() ? 0 : Integer.parseInt(s3);
        return (num1 + num2) == num3;
    }
}
