class Solution {
    public int search(int[] nums, int target) {
        // int s=0 , e=nums.length-1;
        // while(s<=e){
        //     int mid=(s+e)/2;
        //     if(nums[mid]==target){
        //         return mid;
        //     }
        //     // left part sorted
        //     if(nums[s]<=nums[mid]){
        //         // lies in range
        //         if(nums[s]<= target &&target<=nums[mid]){
        //             e=mid-1;
        //         }
        //         else{
        //             s=mid+1;
        //         }
        //     }
        //     // Right part sorted
        //     else{
        //         // lies in range
        //         if(nums[mid]<=target && target<=nums[e]){
        //             s=mid+1;
        //         }
        //         else{
        //             e=mid-1;
        //         }
        //     }
        // }
        // return -1;


        // Recursion
        return optimalSearch(nums,0,nums.length-1,target);

    }

    public static int optimalSearch(int[] arr , int s , int e , int key){
        if(s>e) return -1;
        int mid= (s+e)/2;
        if(arr[mid]==key) return mid;

        // left part sorted
        if(arr[s]<=arr[mid]){
            // lies in range
            if(arr[s]<=key && key<=arr[mid])
                return optimalSearch(arr,s,mid-1,key);
            // does not lie in range
            else
                return optimalSearch(arr,mid+1,e,key);
        }
        // right part is sorted
        else{
            if(arr[mid]<=key && key<=arr[e])    
                return optimalSearch(arr,mid+1,e,key);
            else
                return optimalSearch(arr,s,mid-1,key);
        }

        
    }
}