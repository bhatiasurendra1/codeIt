/***
* Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

Problem Constraints
1 <= A.size() <= 103
1 <= A[i].size() <= 103
1 <= A[i][j] <= 103

Input Format
First argument is a 2D array of integers.(2D matrix).

Output Format
Return an array containing column-wise sums of original matrix.
**/
public class ColumnSum {
    public int[] findColumnSum(int[][] A) {
        int[] columnSum = new int[A[0].length];
        for(int i = 0; i< A[0].length; i ++){
            int sum = 0;
            for(int j = 0; j < A.length; j++){
                sum += A[j][i];
            }
            columnSum[i] = sum;
        }
        return columnSum;
    }
}
