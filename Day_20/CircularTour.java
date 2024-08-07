
// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	    // Your code here
	    int cost = 0;
	    int n = petrol.length;
	    for(int i=0 ; i<n ; i++){
	        cost += (petrol[i]-distance[i]);
	    }
	    
	    if(cost <0) return -1;      // not possible
	    
	    int idx = 0;
	    int curr = 0;
	    for(int i=0 ; i<n ; i++){
	        curr += (petrol[i]-distance[i]);
	        
	        if(curr<0){
	            idx = i+1;
	            curr = 0;
	        }
	    }
	    
	    return idx;
    }

}