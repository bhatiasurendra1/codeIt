/***
Problem Description
Given an array A of length N. Also given are integers B and C.
Return 1 if there exists a subarray with length B having sum C and 0 otherwise


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 104
1 <= B <= N
1 <= C <= 109

Input Format
First argument A is an array of integers.
The remaining arguments B and C are integers

Output Format
Return 1 if such a subarray exist and 0 otherwise
*/

public class SubarrayWithGivenSumAndLength {
    public int subarrayWithGivenSumAndLength(int[] A, int B, int C) {
        int subArrSum = 0;
        for(int i = 0; i < B; i++)
        subArrSum += A[i];
        if(subArrSum == C) return 1;
        for(int i = B; i< A.length; i++){
            subArrSum += A[i];
            subArrSum -= A[i-B];
            if(subArrSum == C) return 1;
        }
        return 0;
    }
}
