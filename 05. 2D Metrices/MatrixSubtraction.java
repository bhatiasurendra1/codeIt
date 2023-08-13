/***
Problem Description

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).
If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.


Problem Constraints

1 <= N, M <= 103
-109 <= A[i][j], B[i][j] <= 109


Input Format
The first argument is the 2D integer array A
The second argument is the 2D integer array B

Output Format
Return a 2D matrix denoting A - B.
*/
public class MatrixSubtraction {
    public int[][] matrixSubtraction(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for(int i = 0; i< A.length; i++){
            for(int j =0; j< A[0].length; j++){
                C[i][j] = A[i][j] - B[i][j];
                
            }
        }
        return C;
    }
}

