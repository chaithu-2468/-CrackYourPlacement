class Solution {
    public int[] twoSum(int[] arr, int target) {
        // TimeComplexity - O(n)
        // space complexity - O(n)
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            int x = target - arr[i];
            if(hm.containsKey(x)){
                return new int[]{i , hm.get(x)} ;
            }
            hm.put(arr[i],i);
        }
        return new int[0];
    }
}