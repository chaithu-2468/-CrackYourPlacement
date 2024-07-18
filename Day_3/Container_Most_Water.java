class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int si = 0 ;
        int ei = n-1;
        int ans = Integer.MIN_VALUE;
        while(si < ei){
            int h = Math.min(height[si] , height[ei]);

            // int currArea = h * (ei-si);
            ans = Math.max(ans , h * (ei-si));

            while(si < ei && height[si] <= h)   si++;
            while(si < ei && height[ei] <= h)   ei--;
        }

        return ans;
    }
}