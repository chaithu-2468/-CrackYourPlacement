class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        boolean[][] vis = new boolean[n][m];
        
        // boundaries that can't be changed and those 
        // conntected with boundaries those also can't be changed
        
        
        for(int i=0 ; i<n ; i++){
            // 0'th coloumn
            if(a[i][0] == 'O' && vis[i][0] == false){
                dfs(i , 0 , n , m , a , vis);
            }
            
            // last column
            if(a[i][m-1] == 'O' && vis[i][m-1] == false){
                dfs(i , m-1 , n , m , a , vis);
            }
        }
        
        // 
        for(int j=0 ; j<m ; j++){
            
            // 0'th row
            if(a[0][j] == 'O' && vis[0][j] == false){
                dfs(0 , j , n , m , a , vis);
            }
            
            // last row
            if(a[n-1][j] == 'O' && vis[n-1][j] == false){
                dfs(n-1 , j , n , m , a, vis);
            }
        }
        
        
        // cahnging the matrix
        for(int i=0 ; i<n; i++){
            for(int j=0 ; j<m ; j++){
                if(a[i][j] == 'O' && vis[i][j] == false){
                    a[i][j] = 'X';
                }
            }
        }
        
        
        return a;
        
    }
    
    public static void dfs(int r , int c , int n , int m , char[][] arr , boolean[][] vis){
        if(r<0 || c<0 || r>=n || c>=m || vis[r][c] == true || arr[r][c] != 'O') return ;
        
        vis[r][c] = true;
        
        // top
        dfs(r-1 , c , n , m , arr , vis);
        // right
        dfs(r , c+1 , n , m , arr , vis);
        // bottom
        dfs(r+1 , c , n , m , arr , vis);
        // left
        dfs(r , c-1 , n , m , arr , vis);
    }
}