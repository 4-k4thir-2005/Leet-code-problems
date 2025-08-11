class Solution {
    public int[] countBits(int n) {
       // List<Integer>list=new ArrayList<>();
        List<String>str=new ArrayList<>();
       for(int i=0;i<=n;i++){
        str.add(Integer.toBinaryString(i));
       } 
       int arr[]=new int[str.size()];
       int index=0;
       for(int i=0;i<str.size();i++){
        int count=0;
        for(int j=0;j<str.get(i).length();j++){
          if(str.get(i).charAt(j)=='1'){
            count++;
          }
        }
        arr[index++]=count;
       }
       return arr;
    }
}