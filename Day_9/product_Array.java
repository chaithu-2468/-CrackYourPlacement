

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long res =1;
        int zero = 0;
        
        for(int ele : nums){
            if(ele != 0)    res *= ele;
            else zero++;
        }
        
        long[] ans = new long[n];
        
        if(zero >=2)    return ans;
        
        if(zero == 1){
            for(int i=0 ; i<n ; i++){
                if(nums[i] != 0)    ans[i] = 0;
                
                else                ans[i] = res;
            }
            
            return ans;
        }
        for(int i=0 ; i<n ; i++){
            if(nums[i] != 0)    ans[i] = res / nums[i];
            
            else                ans[i] = res;
        }
        
        
        return ans;
	} 
} 
