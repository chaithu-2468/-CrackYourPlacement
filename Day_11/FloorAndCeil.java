
// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        
        for(int ele : arr){
            if(ele <= x){
                floor = Math.max(floor , ele);
            }
            
            if(ele >= x){
                ceil = Math.min(ceil , ele);
            }
        }
        
        
        if(floor == Integer.MIN_VALUE)   floor = -1;
        if(ceil  == Integer.MAX_VALUE)  ceil = -1;
        
        
        return new int[]{floor , ceil };
    }
}