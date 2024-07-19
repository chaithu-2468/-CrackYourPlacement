class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        // int n=matrix
        int sr=0 , sc=0 , er=matrix.length-1 , ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            // Top
            for(int j=sc ; j<=ec ; j++){
                list.add(matrix[sr][j]);
            }

            // Right
            for(int i=sr+1 ; i<=er;i++){
                list.add(matrix[i][ec]);
            }

            // Bottom
            for(int j=ec-1 ; j>=sc ; j--){
                if(sr!=er){
                    list.add(matrix[er][j]);
                }
            }

            // Left
            for(int i=er-1 ; i>=sr+1 ; i--){
                if(sc!=ec){
                    list.add(matrix[i][sc]);
                }
            }
            sr++;
            er--;
            sc++;
            ec--;
        }

        return list;
    }
}