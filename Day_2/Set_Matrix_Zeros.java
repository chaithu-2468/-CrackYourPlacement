class Solution {
    static class Pair{
        int row ;
        int col;

        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }
    public void setZeroes(int[][] matrix) {
        Queue<Pair> qu = new LinkedList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0 ; i<n  ;i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] == 0)   qu.offer(new Pair(i , j));
            }
        }

        while(!qu.isEmpty()){
            Pair curr = qu.poll();

            for(int i=0 ; i<m ;i++)     matrix[curr.row][i]=0;
            for(int i=0 ; i<n ; i++)    matrix[i][curr.col]=0;
            
        }
    }
}