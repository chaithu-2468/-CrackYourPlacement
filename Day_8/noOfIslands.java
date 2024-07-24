
class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] mat) {
        // Code here
        
        int cnt=0;
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(mat[i][j] =='1'){
                    change(i,j,n,m,mat);
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
    
     public static void change(int r , int c , int n , int m , char[][] mat){
        if(r<0 || c<0 || r>=n || c>= m || mat[r][c] == '0')   return;
        
        mat[r][c]='0';
        
        // top-left
        change(r-1 , c-1 , n , m , mat);
        // top
        change(r-1 , c , n , m  , mat);
        // top - right
        change(r-1 , c+1 , n , m   , mat);
        // right
        change(r , c+1 , n , m , mat);
        // bottom-right
        change(r+1 , c+1 , n, m , mat);
        // bottom
        change(r+1 , c , n , m  , mat);
        // bottom-left
        change(r+1 , c-1 , n , m , mat);
        // left
        change(r , c-1 , n , m , mat);
    }
}