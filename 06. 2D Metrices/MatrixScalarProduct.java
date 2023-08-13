/***
Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000
1 <= B <= 1000

Input Format
First argument is 2D array of integers A representing matrix.
Second argument is an integer B.

Output Format
You have to return a 2D array of integers after doing required operations.

Example Input:
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
B = 2 

Example Output:
[[2, 4, 6], 
[8, 10, 12], 
[14, 16, 18]]
*/
public class MatrixScalarProduct {
    public int[][] getMatrixScalarProduct(int[][] A, int B) {
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                A[i][j] = A[i][j]*B;
            }
        }
        return A;
    }
}
