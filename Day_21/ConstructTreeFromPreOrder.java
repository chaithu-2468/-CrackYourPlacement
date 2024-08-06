
/*class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
class Solution{

    // Approach -I   O(n) + O(1)     
    static int idx = -1;
    public static Node buildTree(int[] pre , char[] preLN){
        if(idx >= pre.length)   return null;
        idx++;
        Node curr = new Node(pre[idx]);
        
        if(preLN[idx] == 'L'){
            return curr;
        }
        curr.left = buildTree(pre , preLN);
        curr.right = buildTree(pre , preLN);
        
        return curr;
    }
    Node constructTree(int n, int pre[], char preLN[]){
	    // code here
	    idx = -1;
	    return buildTree(pre , preLN);
    }
}




/*class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
class Solution{
    public static int idx = -1;
    public static Node buildTree(ArrayList<Integer> list){
        idx++;
        if(idx >= list.size() || list.get(idx) == -1)   return null;
        
        Node curr = new Node(list.get(idx));
        
        curr.left = buildTree(list);
        curr.right = buildTree(list);
        
        return curr;
    }
    Node constructTree(int n, int pre[], char preLN[]){
	    // code here
	    idx = -1;
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    for(int i=0 ; i<n; i++){
	        list.add(pre[i]);
	        if(preLN[i] == 'L'){
	            list.add(-1);
	            list.add(-1);
	        }
	    }
	    
    	return    buildTree(list);
    }
}