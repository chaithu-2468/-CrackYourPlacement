class Solution {
    public int maxProfit(int[] arr) {
        int maxprofit=Integer.MIN_VALUE;
        int buyprice = arr[0];

        for(int price : arr){
            buyprice = Math.min(buyprice , price);
            maxprofit = Math.max(maxprofit , price-buyprice);
        }
        
        return maxprofit;
    }
}