
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    static class Box{
        int row;
        int col;
        int time;
        
        Box(int row , int col , int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid)
    {
        // Code here
        
        int n = grid.length;
        int m = grid[0].length;
        
        int fresh = 0 , rotten = 0;
        Queue<Box> qu = new LinkedList<>();
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    rotten ++;
                    qu.offer(new Box(i , j ,0));
                }
            }
        }
        
        if(fresh == 0)  return 0;
        if(rotten == 0) return -1;
        
        
        int time = 0;
        
        while(!qu.isEmpty()){
            Box curr = qu.poll();
            
            time = Math.max(time , curr.time);
            
            int[] dx = {-1 , 1 , 0 , 0};
            int[] dy = {0 , 0 , 1 , -1};
            
            for(int i=0 ; i<4 ; i++){
                int newrow = curr.row+dx[i];
                int newcol = curr.col+dy[i];
                
                if(newrow>=0 && newcol>=0 && newrow<n && newcol<m && grid[newrow][newcol] == 1){
                    grid[newrow][newcol]=2;
                    fresh--;
                    qu.offer(new Box(newrow , newcol , curr.time+1));
                    
                }
            }
        }
        
        
        if(fresh == 0)  return time;
        else            return -1;
    }
}