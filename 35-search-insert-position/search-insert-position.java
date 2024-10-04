class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int res=0;
        for(int i=0;i<len;i++){
            if(nums[i]==target){
                res=i;
            }
            else if(nums[i]==target-1){
                res=i+1;
            }
            else if(nums[i]<target){
                res=i+1;
            }
        }
        return res;
    }
}