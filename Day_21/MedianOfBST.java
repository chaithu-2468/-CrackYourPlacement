
//User function Template for Java

class Tree
{
    public static void inorder(Node root , ArrayList<Integer> list){
        if(root == null)    return ;
        
        inorder(root.left , list);
        list.add(root.data);
        inorder(root.right , list);
    }
    public static float findMedian(Node root)
    {
        // code here.
        
        if(root == null)    return 0f;
        
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root , list);
        
        int n = list.size();
        
        if( n%2 == 1){
            return (float)list.get(n/2);
        }
        
        float ans = (list.get(n/2) + list.get((n-1)/2))/2.0f;
        return ans;
    }
}