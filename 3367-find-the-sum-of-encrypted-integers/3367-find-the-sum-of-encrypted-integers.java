class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
          int temp=i;
          int max=Integer.MIN_VALUE;
          while(temp>0){
            int rem=temp%10;
              if(rem>max){
                max=rem;
              }
              temp/=10;
          }
           char a=(char)(max+'0');
          StringBuilder sb=new StringBuilder();
          String ans=String.valueOf(i);
          for(char ch:ans.toCharArray()){
            if(ch!=a){
              sb.append(a);
            }
            else{
                sb.append(ch);
            }
          }
          sum+=Integer.valueOf(sb.toString());
        }
        return sum;
    }
}