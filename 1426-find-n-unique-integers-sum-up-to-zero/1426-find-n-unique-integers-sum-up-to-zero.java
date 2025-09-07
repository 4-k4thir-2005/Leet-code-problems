class Solution {
    public int[] sumZero(int n) {
     int arr[]=new int[n];
     int num=1;
    for(int i=0;i<n-1;i+=2){
        arr[i]=num;
        arr[i+1]=-num;
        num++;
    } 
    if(n%2==1){
       arr[n-1]=0;
     }
     return arr;
    }
}