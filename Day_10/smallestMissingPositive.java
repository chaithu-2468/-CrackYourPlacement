class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int[] temp = new int[size+1];
        
        for(int ele : arr){
            if(ele > 0 && ele<temp.length) temp[ele]++;
        }
        
        for(int i=1 ; i<temp.length ; i++){
            if(temp[i] == 0)    return i;
        }
        
        return -1;
    }
}