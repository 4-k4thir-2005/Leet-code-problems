class Solution {
    public boolean doesAliceWin(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            switch (ch){
            case 'a','e','i','o','u':
            return true;
            }
        }
        return false;
    }
}