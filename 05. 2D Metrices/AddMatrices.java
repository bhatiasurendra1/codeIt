/***
Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

Problem Constraints
1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000

Input Format
The first argument is the 2D integer array A The second argument is the 2D integer array B

Output Format
You have to return a vector of vector of integers after doing required operations.
*/

public class AddMatrices {
    public int[][] addMatrices(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for(int i = 0; i< A.length; i++){
            for(int j =0; j< A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
                
            }
        }
        return C;
    }
}
