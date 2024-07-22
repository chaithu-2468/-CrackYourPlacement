class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0 , rightSum=0 , maxSum=0;

        for(int i=0 ; i<k ; i++){
            leftSum += cardPoints[i];
        }
        maxSum = Math.max(leftSum+rightSum , maxSum);

        
        for(int left = k-1 , right = cardPoints.length-1 ; left>=0 ; left-- , right--){
            leftSum -= cardPoints[left];
            rightSum += cardPoints[right];

            maxSum = Math.max(leftSum+rightSum , maxSum);
        }

        return maxSum;
    }
}