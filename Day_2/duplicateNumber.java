class Solution {
    public int findDuplicate(int[] arr) {
        
        // All values are in range 1-n
        // so we place all the values into the same array with the same idx
        // stopping condition is whenever u find the value and the idx is same
        // then stop and 0 is not a value according to the condition
        // the ans will be stored in 0 th idx
        while(arr[arr[0]] != arr[0]){
            // Swap
            int temp = arr[0];
            arr[0] = arr[arr[0]];
            arr[temp] = temp;
        }

        return arr[0];
    }
}