

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++)  map.put(nums[i] , i);
        
        Arrays.sort(nums);
        
        int cnt = 0;
        for(int i=0 ; i<nums.length ; i++){
            int ele = nums[i];
            
            while(map.get(ele) != i){
                // Swap
                int temp = nums[i];
                nums[i] = nums[map.get(ele)];
                nums[map.get(ele)] = temp;
                
                cnt++;
                ele = nums[i];
            }
        }
        
        return cnt;
    }
}