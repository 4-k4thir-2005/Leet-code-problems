class Solution {
    public int kthFactor(int n, int k) {
        List<Integer>list=new ArrayList<>();
       for(int i=1;i<=n;i++){
        if(n%i==0){
            list.add(i);
        }
       } 
       int count=1;
       int res=-1;
       if(list.size()<k){
        return -1;
       }
      for(int i=0;i<list.size();i++){
        if(count<=k){
            res=list.get(i);
            count++;
        }
      }
      return res;
    }
}