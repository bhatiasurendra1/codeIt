/***
Problem Constraints

1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000


Input Format
First argument is a 2D matrix of integers.


Output Format
You have to return the Transpose of this 2D matrix.

Example:
Input :
A = [ 
[1, 2, 3],
[4, 5, 6],
[7, 8, 9]
]

Output:
A=[
[1, 4, 7], 
[2, 5, 8], 
[3, 6, 9]
]
*/

public class MatrixTranspose {
    public int[][] matrixTranspose(int[][] A) {
        int M = A.length;
        int N = A[0].length;
        int[][] transpose = new int[N][M];
        for(int i = 0; i < M; i++){
            for(int j = 0; j< N; j++){
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }
}
