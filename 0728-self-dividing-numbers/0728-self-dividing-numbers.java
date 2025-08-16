class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list1=new ArrayList<>();
          for(int i=left;i<=right;i++){
              int temp=i;
              boolean valid=true;
            while(temp>0){
                int rem=temp%10;
                if(rem==0||i%rem!=0){
                   valid=false;
                   break;
                }
                temp/=10;
            }
            if(valid)
            list1.add(i);
          }
        return list1;
    }
}