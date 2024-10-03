class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        for(int i=0;i<len;i++){
            res[i]=1;
        }   
        int l=1;
        for(int i=0;i<len;i++){
            res[i]=res[i]*l;
            l=l*nums[i];
        }
        int r=1;
        for(int i=len-1;i>=0;i--){
            res[i]=res[i]*r;
            r=r*nums[i];
        }
        return res;
    }
}