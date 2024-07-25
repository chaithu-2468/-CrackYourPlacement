class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        // Approach -1
        // int temp = nums[nums.length/2];
        // int ans=0;
        // for(int ele : nums)     ans += Math.abs(temp-ele);
        // return ans;

        // Approach-2 
        int si=0 , ei = nums.length-1;
        int ans = 0;

        while(si < ei){
            ans += Math.abs(nums[si] - nums[ei]);
            si++;
            ei--;
        }

        return ans;
    }
}