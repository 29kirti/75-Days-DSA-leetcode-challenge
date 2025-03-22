class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int cnt=0; int mac=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            cnt+=nums[i];
            mac=Math.max(mac,cnt);
            if(cnt<0){
                cnt=0;
            }
        }
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            
        temp+=nums[i];
        mini=Math.min(mini,temp);
        if(temp>0)temp=0;
      
        }
         return (Math.abs(mac)<Math.abs(mini))?Math.abs(mini):Math.abs(mac);
    }
}