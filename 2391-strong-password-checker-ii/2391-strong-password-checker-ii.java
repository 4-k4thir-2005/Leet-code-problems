class Solution {
    public boolean strongPasswordCheckerII(String s) {
        int n=s.length();
        if(n<8){
            return false;
        }
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;
        String sp="!@#$%^&*()-+";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)) upper=true;
            else if(Character.isLowerCase(ch)) lower=true;
            else if(Character.isDigit(ch)) digit=true;
            else if(sp.indexOf(ch)>=0) special=true;
            else return false;

            if(i>0 && ch==s.charAt(i-1)) return false;
        }
        return upper && lower && digit && special;
    }
}