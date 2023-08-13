/***
Problem Description

Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.


Problem Constraints
1 <= N <= 103
1 <= A[i] <= 1000
1 <= B <= 107

Input Format
First argument is an integer array A.
Second argument is an integer B.


Output Format
Return an integer denoting the number of subarrays in A having sum less than B.
*/

public class CountingSubarrays {
    public int countSubarrays(int[] A, int B) {
        int countOfSubArrays = 0; 
        for(int i = 0; i < A.length; i++){
            int sum = 0;
            for(int j = i; j < A.length; j++){
                sum += A[j];
                if(sum < B) countOfSubArrays++;
            }
        }
        return countOfSubArrays;
    }
}
