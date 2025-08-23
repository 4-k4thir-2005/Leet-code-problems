class Solution {
    public int firstMissingPositive(int[] arr) {
    Arrays.sort(arr);
    int smallpos=1;
    for(int i:arr){
        if(i==smallpos){
        smallpos++;
        }
     }
     return smallpos;
    }
}