
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 5, 4, 3};
		
		int[] clone = arr.clone();
	    Arrays.sort(clone);
	    
	    int i=0 , j=0;
	    
	    while(i<arr.length && arr[i] == clone[j]){
	        i++;
	        j++;
	    }
	    if(i == arr.length){
	        System.out.println("True");
	        return ;
	    }
	    j=arr.length-1;
	    while(i<arr.length){
	        if(arr[i] != clone[j]){
	            System.out.println("False");
	            return;
	        }
	        i++;
	        j--;
	    }
	    System.out.println("True");
	    return ;
	    
	}
}