class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum=0 ,rightsum=0, leftsum=0;
       for(int x:nums){
        totalsum+=x;

       }
       for(int i=0;i<nums.length;i++){
        rightsum=totalsum-leftsum-nums[i];
        if(rightsum==leftsum){
            return i;
        }
        leftsum+=nums[i];
       }
    
        
        return -1;
    }
}