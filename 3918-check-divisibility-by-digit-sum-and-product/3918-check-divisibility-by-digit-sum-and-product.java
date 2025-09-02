class Solution {
    public boolean checkDivisibility(int n) {
    int temp=n;
    int sum=0;
    int pro=1;
    while(temp>0){
      int rem=temp%10;
      sum+=rem;
      pro*=rem;
      temp/=10;
     }
     int total=sum+pro;
     return total !=0 && n%total==0;
    }
}