
class Solution {
    public static void swap(char[] arr, int left , int right){
        while(left<right){
            char ch= arr[left];
           arr[left]=arr[right];
            arr[right]=ch;
            left++;
            right--;
        }
    }
    public String reverseStr(String s, int k) {
        int n=s.length();
        char[] arr=s.toCharArray();
     for(int i=0;i<n;i+=2*k){
        int end=Math.min(i+k-1,n-1);
        swap(arr,i,end);
     }
   
        return  new String(arr);
    }
}