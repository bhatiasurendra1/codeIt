/***
Problem Description

You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.


Problem Constraints
1 <= N <= 105
1 <= Ai <= 10 4

Input Format
The first argument is the integer array A.

Output Format
Return a single integer denoting the sum of all subarray sums of the given array.
*/
public class SumOfAllSubarrays {
    public long subarraySum(int[] A) {
        long totalSum = 0L;
        for(int i = 0; i < A.length; i++){
            long countOfI = (long)(i+1)*(A.length - i);
            long contributonOfI = (long) countOfI*A[i];
            totalSum += contributonOfI;
        }
        return totalSum;
    }
}
