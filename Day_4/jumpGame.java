class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        if(n==1)    return true;

        int idx =0 ;
        int max =0;
        while(idx < n){
            if(idx == n-1)  return true;
            max = Math.max(max-1 , nums[idx]);
            idx++;
            if(max == 0 )  return false;
        }

        return true;
    }
}