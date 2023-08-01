/***
* Equilibrium index of an array
* Problem Description
*
* You are given an array A of integers of size N.
* Your task is to find the equilibrium index of the given array
* The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
* If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
*
* Note:
*
*    Array indexing starts from 0.
*   If there is no equilibrium index then return -1.
*   If there are more than one equilibrium indexes then return the minimum index.
*
* Problem Constraints
* 1 <= N <= 105
* -105 <= A[i] <= 105
*
* Input Format
* First arugment is an array A .
*
* Output Format
* Return the equilibrium index of the given array. If no such index is found then return -1.
***/

public class EquilibriumIndexOfArray {
    public int equilibriumIndexOfArray(int[] A) {
    // First we should calculate the prefix sum of the array to make the computation faster        
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        for(int i = 1 ; i< A.length ; i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }
   // Now we can write the logic to find left and right sum for each element of array A. 
   // leftSum for index i will be  prefixSum[i-1] and rightSum for index i will be prefixSum[prefixSum.length - 1] - prefixSum[i];

        for(int i = 0; i < prefixSum.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            if(i > 0) leftSum = prefixSum[i-1];
            rightSum = prefixSum[prefixSum.length - 1] - prefixSum[i];

            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}
