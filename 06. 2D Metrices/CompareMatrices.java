/***
Problem Description
You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.

NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.


Problem Constraints
1 <= A.size(), B.size() <= 1000
1 <= A[i].size(), B[i].size() <= 1000
1 <= A[i][j], B[i][j] <= 1000
A.size() == B.size()
A[i].size() == B[i].size()


Input Format

First argument is 2-D array of integers representing matrix A.
Second argument is 2-D array of integers representing matrix B.


Output Format
Return 1 if both matrices are equal or return 0.
*/

public class CompareMatrices {
    public int compareMatrices(int[][] A, int[][] B) {
        for(int i = 0; i< A.length; i++){
            for(int j =0; j< A[0].length; j++){
                if(A[i][j] != B[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
