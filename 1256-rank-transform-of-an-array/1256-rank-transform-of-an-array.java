class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int res[]=new int[n];
        int ans[]=arr.clone();
        Arrays.sort(ans);
        Set<Integer>set=new TreeSet<>();
        for(int i:ans){
            set.add(i);
        }
        Map<Integer,Integer>map=new HashMap<>();
        int rank=1;
        for(int num:set){
          map.put(num,rank++);
        }
        for(int i=0;i<n;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}