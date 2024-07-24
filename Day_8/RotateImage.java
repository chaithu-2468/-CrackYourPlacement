// Method-1 (using extra space)
// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         int[][] ans = new int[n][n];

//         for(int i=0 ; i<n ; i++){
//             for(int j=0 ; j<n ; j++){
//                 ans[j][n-i-1] = matrix[i][j];
//             }
//         }

//         for(int i=0 ; i<n ; i++){
//             for(int j=0 ; j<n ; j++){
//                 matrix[i][j] = ans[i][j];
//             }
//         }
//     }

// }

// Method-2
class Solution {
    public void rotate(int[][] matrix) {
        // Find the transpose
        int n = matrix.length;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                // swap (matrix[i][j] , matrix[j][i])

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // now reverse the each row

        for(int i=0 ; i<n ; i++){
            int s=0 , e=n-1;

            while(s<e){
                // swap (arr[i][s] , arr[i][e])
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;

                s++;
                e--;
            }
        }
    }
}