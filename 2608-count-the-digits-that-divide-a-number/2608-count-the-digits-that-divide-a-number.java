class Solution {
    public int countDigits(int num) {
        int org=num;
        if(num<9){
            return 1;
        }
        int count=0;
        while(num!=0){
            int rem=num%10;
            if(org%rem==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}