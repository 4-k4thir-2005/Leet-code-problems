class Solution {
    public int secondHighest(String s) {
    Set<Integer>set=new HashSet<>();
     for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
            int num=Integer.parseInt(String.valueOf(ch));
            if(!set.contains(num)){
                set.add(num);
            }
        }
     } 
     int arr[]=new int[set.size()];
     int index=0;
     for(int k:set){
        arr[index++]=k;
     }  
     Arrays.sort(arr);
     if(arr.length<2){
        return -1;
     }
     return arr[arr.length-2];
    }
}