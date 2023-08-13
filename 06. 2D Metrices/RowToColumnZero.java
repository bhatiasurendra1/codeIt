/**
* Problem Description

You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints
1 <= A.size() <= 103
1 <= A[i].size() <= 103
0 <= A[i][j] <= 103


Input Format
First argument is a 2D integer matrix A.


Output Format
Return a 2D matrix after doing required operations.
*/

public class RowToColumnZero {
    public int[][] rowToColumnZero(int[][] A) {
        ArrayList<Integer> indicesOfI = new ArrayList<Integer>();
        ArrayList<Integer> indicesOfJ = new ArrayList<Integer>();

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j< A[0].length; j++){
                 if(A[i][j] == 0) {
                   indicesOfI.add(i);
                   indicesOfJ.add(j);
                 }
            }
        }
        
        for(int k:indicesOfI) {
            for(int j = 0; j < A[0].length; j++){
                A[k][j] = 0;
            }
        }
        for(int k:indicesOfJ) {
            for(int i = 0; i < A.length; i++){
                A[i][k] = 0;
            }
        }

        return A;
    }
}
