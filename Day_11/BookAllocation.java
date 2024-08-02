
// User function Template for Java

class Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        
        if(arr.length < m)  return -1;
        int totalSum =0 , maxVal = Integer.MIN_VALUE;
        
        for(int ele : arr){
            maxVal = Math.max(maxVal , ele);
            totalSum += ele;
        }
        
        
        int low = maxVal , high = totalSum;
        
        // for(int i=low ; i<= high ; i++){
        //     int count = findStudents(arr , i);
            
        //     if(count == m){
        //         return i;
        //     }
        // }
        
        while(low <= high){
            int mid = (low+high)/2;
            
            int students = findStudents(arr , mid);
            
            if(students > m){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        
        return low;
    }
    
    public static int findStudents(int[] arr , int max){
        int students=1;
        int booksAllocated=0;
        
        for(int i=0 ; i<arr.length ; i++){
            if(booksAllocated + arr[i] <= max){
                booksAllocated += arr[i];
            }
            else{
                students += 1;
                booksAllocated = arr[i];
            }
        }
        
        return students;
    }
    
}