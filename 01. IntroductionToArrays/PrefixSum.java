/***
* Problem Description
*
* You are given an integer array A of length N.
* You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
* For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
* More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
*
* Problem Constraints
* 1 <= N, M <= 105
* 1 <= A[i] <= 109
* 0 <= L <= R < N
*
* Input Format
* The first argument is the integer array A.
* The second argument is the 2D integer array B.
*
* Output Format
* Return an integer array of length M where ith element is the answer for ith query in B.
***/

public class RangeSumUsingPrefixSum {
    public long[] rangeSumUsingPrefixSum(int[] A, int[][] B) {

    // Calculate PrefixSum Array
        long[] prefixSum = new long[A.length];
        prefixSum[0] = A[0];
        for(int i = 1; i < A.length; i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }

    //Now we will Calculate the sum for indices range in B
        long[] rangeSum = new long[B.length];
        for(int i = 0; i < B.length; i++){
            int L = B[i][0];
            int R = B[i][1];
            if (L == 0) rangeSum[i] = prefixSum[R];
            else rangeSum[i] = prefixSum[R] - prefixSum[L-1];
        }
        return rangeSum;
    }
}
