class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        if (nums == null || nums.length < 4) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1 ; j<n ; j++){
                if(j>i+1 && nums[j] == nums[j-1])   continue;

                int s = j+1;
                int e = n-1;

                while(s<e){
                    long sum =(long) nums[i]+ (long)nums[j] +(long) nums[s] +(long) nums[e];

                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i] , nums[j] , nums[s] , nums[e]);
                        ans.add(temp);
                        s++;
                        e--;

                        while(s<e && nums[s] == nums[s-1])  s++;
                        while(s<e && nums[e] == nums[e+1])  e--;
                    }
                    else if(sum < target)   s++;
                    else                    e--;
                }
            }
        }


        return ans;
    }
}