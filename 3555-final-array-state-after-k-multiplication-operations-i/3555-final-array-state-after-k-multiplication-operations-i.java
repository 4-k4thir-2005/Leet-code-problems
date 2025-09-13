class Solution {
    public int[] getFinalState(int[] arr, int k, int m) {
        int n=arr.length;
        while(k>0){
            int min=0;
            for(int i=1;i<n;i++){
                if(arr[i]<arr[min]){
                    min=i;
                }
            }
            arr[min]*=m;
            k--;
        }
        return arr;
    }
}