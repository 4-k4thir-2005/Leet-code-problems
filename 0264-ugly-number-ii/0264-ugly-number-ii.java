class Solution {
    public int nthUglyNumber(int n) {
        int []ugly=new int[n];
        ugly[0]=1;
        int two=0;
        int three=0;
        int five=0;
        for(int i=1;i<n;i++){
           int next1=ugly[two]*2;
           int next2=ugly[three]*3;
           int next3=ugly[five]*5;
           int next=Math.min(next1,Math.min(next2,next3));
           ugly[i]=next;
           if(next==next1) two++;
           if(next==next2) three++;
           if(next==next3) five++;
        }
        return ugly[n-1];
    }
}