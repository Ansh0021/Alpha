class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int len=nums.length;
        if(len==1){
            return nums[0];
        }
        for(int i=0;i<len;i++){
            int n=nums[i];
            if(hm.containsKey(n)==false){
                hm.put(n,1);
            }
            else if(hm.containsKey(n)==true){
                hm.put(n,hm.get(n)+1);
                if(hm.get(n)>Math.floor(len/2)){
                    return n;
                }
            }
        }
        return -1;
    }
}