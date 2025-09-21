class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        int start=0;
        int end=arr.length-1;
        while(start<end){
            String temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        StringBuilder sb=new StringBuilder();
        for(String k:arr){
            sb.append(k).append(" ");
        }
        return sb.toString().trim();
    }
}