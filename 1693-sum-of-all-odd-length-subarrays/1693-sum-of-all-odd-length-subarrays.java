class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int res[]=new int[j-i+1];
                int index=0;
                for(int k=i;k<=j;k++){
                    res[index++]=arr[k];
                }
                int len=res.length;
                if(len%2!=0){
                   for(int s:res)
                    sum+=s;
                }
            }
        }
        return sum;
    }
}