class Solution
{
    public long findMinDiff (ArrayList<Integer> list, int n, int m)
    {
        // your code here
        long ans = Integer.MAX_VALUE;
        
        Collections.sort(list);
        for(int i=0 ; i<n-m+1 ; i++){
            int min = list.get(i);
            int max = list.get(i+m-1);
            
            ans = (long)Math.min(ans , max-min);
        }
        
        return ans;
        
    }
}