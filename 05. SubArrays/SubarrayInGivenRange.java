/***
Problem Description
Given an array A of length N, return the subarray from B to C.

Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C < N

Input Format
The first argument A is an array of integers
The remaining argument B and C are integers.

Output Format
Return a subarray
***/

public class SubarrayInGivenRange {
    public int[] findSubarrayInGivenRange(int[] A, int B, int C) {
        int[] subArr = new int[C-B+1];
        int subArrIndex = 0;
        for(int i = B; i <= C; i++){
            subArr[subArrIndex] = A[i];
            subArrIndex++; 
        } 
        return subArr;
    }
}
