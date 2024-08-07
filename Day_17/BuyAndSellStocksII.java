class Solution {
    public int maxProfit(int[] prices) {
        // return helper(idx , )
        int n = prices.length;
        int[][] dp = new int[n][2];

        for(int[] arr : dp) Arrays.fill(arr , -1);
        int max = 0;
        max = helper(0 , prices , 1 , dp);

        return max ;
    }

    public int helper(int idx , int[] arr , int buy , int[][] dp){
        if(idx == arr.length)   return 0;

        if(dp[idx][buy] != -1)  return dp[idx][buy];
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-arr[idx] + helper(idx+1 , arr , 0 , dp ) , helper(idx+1 , arr , 1 , dp));
        }
        else{
            profit = Math.max(arr[idx]+ helper(idx+1 , arr , 1 , dp) , helper(idx+1 , arr , 0 , dp));
        }

        return dp[idx][buy] = profit;
    }
}