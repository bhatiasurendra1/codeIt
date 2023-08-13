/***
Problem Constraints
1 <= A.size() <= 103
1 <= A[i].size() <= 103
1 <= A[i][j] <= 103


Input Format
First argument A is a 2D array of integers.(2D matrix).

Output Format
Return an array containing row-wise sums of original matrix.
*/

public class RowSum {
    public int[] findRowSum(int[][] A) {
        int[] rowSum = new int[A.length];
        for(int i = 0; i < A.length; i++){
            int sum = 0;
            for(int j = 0; j< A[0].length; j++){
                sum += A[i][j];
            }
            rowSum[i] = sum;
        }
        return rowSum;
    }
}
