/***
* Problem Description
* Given an array A of N integers. Construct prefix sum of the array in the given array itself.
*
* Problem Constraints
* 1 <= N <= 105
* 1 <= A[i] <= 103
*
* Input Format
* Only argument A is an array of integers.
*
* Output Format
* Return an array of integers denoting the prefix sum of the given array.
***/

public class CalculateInPlacePrefixSum {
    public int[] calculateInPLacePrefixSum(int[] A) {
        //Create prefixSum array
        for(int i = 1; i < A.length; i++){
            A[i] = A[i] + A[i-1];
        }
        return A;
    }
}
