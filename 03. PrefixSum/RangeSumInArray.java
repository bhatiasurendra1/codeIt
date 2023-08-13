/***
* Problem Description
* You are given an integer array A of length N.
* You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
* For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
* More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
*
*Problem Constraints
* 1 <= N, M <= 103
* 1 <= A[i] <= 105
* 0 <= L <= R < N
*
* Input Format
*
* The first argument is the integer array A.
* The second argument is the 2D integer array B.
*
* Output Format
*
* Return an integer array of length M where ith element is the answer for ith query in B.
***/

public class RangeSumInArray {
    public int[] rangeSumInArray(int[] A, int[][] B) {
        int[] rangeSum = new int[B.length];
        for(int i = 0; i < B.length; i++) {
            rangeSum[i] = calculateSum(A, B[i][0], B[i][1]);
        }
        return rangeSum;
    }

    private int calculateSum(int[] A, int L, int R){
            int sum = 0;
            for(int i = L; i<= R; i++){
                sum += A[i];
            }
            return sum;
        }
}
