class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        // Pegion hole Principle
        // each idx will act as idx to the value 
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            int ele = Math.abs(nums[i]);
            int idx = ele-1;
            // already ele is found before
            if(nums[idx] < 0){
                res.add(ele);
            }else{
                // make idx value as negative
                nums[idx] *= -1;
            }
        }

        return res;
    }
}