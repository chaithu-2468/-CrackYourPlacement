
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       
    //   Approach - 1
    // O(n)
    //   for(int i=0 ; i<n ; i++){
           
    //       if((i==0 || arr[i-1] <= arr[i]) && (i == n-1 || arr[i] >= arr[i+1])){
    //           return i;
    //       }
    //   }
    //   return -1;
       
    //  Approach - 2
    // O(log n)
    
        // Assuming that there will be atleast one peak element
        
        
        if(n==1)    return 0;
        // checking start or end index may be a peak element
        if(arr[0] >= arr[1])    return 0;
        if(arr[n-1] >= arr[n-2])    return n-1;
        
        
        // checking for remaning Array
        
        int start = 1 , end = n-2;
        
        while(start <= end){
            int mid =(end +start)/2;
            
            // peak element condotion
            
            
            if(arr[mid-1] <= arr[mid] && arr[mid] >= arr[mid+1])  return mid;
            
            
            // peak element on right side
            if(arr[mid-1] <= arr[mid])   start = mid+1;
            else                        end = mid-1;
            
            
            
        }
        
        return -1;
    }
}