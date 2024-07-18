class Solution {
    public boolean exist(char[][] board, String word) {
        
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis = new boolean[n][m];
        boolean res=false;

        for(int i=0 ;i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(board[i][j] == word.charAt(0))
                    res=search(board,vis,word,i,j);

                if(res) return true;
            }
        }

        return false;

    }

    public static boolean search(char[][] board , boolean[][] vis , String s,int r,int c){
        if(s.isEmpty()) return true;
        
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || vis[r][c] || board[r][c] !=s.charAt(0)) return false;

        vis[r][c]=true;

        if(search(board , vis , s.substring(1) , r+1 , c)||
            search(board , vis , s.substring(1) , r-1 , c)||
            search(board , vis , s.substring(1) , r , c+1)||
            search(board , vis , s.substring(1) , r , c-1))     return true;

        vis[r][c]=false;
        return false;

    }
}