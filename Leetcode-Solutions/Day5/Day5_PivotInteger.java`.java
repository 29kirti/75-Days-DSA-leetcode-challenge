class Solution {
    public int pivotInteger(int n) {
       
        int num =(n*(n+1))/2;

        int cnt=(int)Math.sqrt(num);
        if(cnt*cnt==num)return cnt;
        
        return -1;
    }
}