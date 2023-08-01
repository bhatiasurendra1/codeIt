/***
* Problem Description
* Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
* 
* Problem Constraints
* 1 <= N <= 105
* -109 <= A[i] <= 109
*
* Input Format
* First argument A is an integer array.
*
* Output Format
* Return the sum of maximum and minimum element of the array
***/

public class MaxMinArray {
    public int maxMinArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< A.length; i++){
            if(A[i] > max) max = A[i];
            if(A[i] < min) min = A[i];
        }
        return min + max; 
    }
}

