// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        
        // TimeComplexity - O(n^2) 
        // SpaceComplexity - O(1)
        
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0 ; i<n ; i++){
            boolean isPossible = true;
            for(int j=0 ; j<m; j++){
                if(i!=j){
                    if(mat[i][j] != 0 || mat[j][i] != 1){
                        isPossible = false;
                    }
                }
            }
            
            if(isPossible)  return i;
        }
        
        return -1;

        // TimeComplexity = O(n)
        // Space Complexity = O(n)  
        
        Stack<Integer> st = new Stack<>();
        int n = mat.length;
        for(int i=0 ; i<n ; i++)    st.push(i);
        
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            
            if(mat[a][b] == 1)          st.push(b);
            else if(mat[b][a] == 1)     st.push(a);
            
        }
        
        
        
        int possibleCelebrity = st.pop();
        
        for(int i=0 ; i<n ; i++){
            if(possibleCelebrity != i && mat[possibleCelebrity][i] == 1) {
                return -1;
            }
        }
        
        return possibleCelebrity;
    }
}