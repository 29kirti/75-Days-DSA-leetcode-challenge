class Solution {
    public int countValidSelections(int[] nums) {
    int valid=0;
    for(int i=0;i<nums.length;i++){
    if(nums[i]==0)
    {
    if(isValid(nums.clone(),i,-1)) valid++;
    if(isValid(nums.clone(),i,1)) valid++;
    }}
    
    return valid;}
static boolean isValid(int[]nums ,int curr, int dir){
 while (curr >= 0 && curr < nums.length) {
if(nums[curr]==0){
curr+=dir;
}
else{
nums[curr]-- ;
dir=-dir;
curr+=dir;}
}
for( int num:nums){
if(num!=0) return false;}
return true;}}
