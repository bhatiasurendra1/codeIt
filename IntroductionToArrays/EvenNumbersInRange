/*** Problem Description
*
* You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
* Each query consists of two integers B[i][0] and B[i][1].
* For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
*
* Problem Constraints
* 1 <= N <= 105
* 1 <= Q <= 105
* 1 <= A[i] <= 109
* 0 <= B[i][0] <= B[i][1] < N
*
* Input Format
* First argument A is an array of integers.
* Second argument B is a 2D array of integers.
*
* Output Format
* Return an array of integers.
***/

public class EvenNumbersInRange {
    public int[] findEvenNumbersInRange(int[] A, int[][] B) {
        // Let's calculate the prefixSum array for all even number counts.
        int[] prefixSumOfEvenNumbers = new int[A.length];
        if (A[0] % 2 == 0) prefixSumOfEvenNumbers[0] = 1; 
        else prefixSumOfEvenNumbers[0] = 0;
        for(int i = 1; i < A.length ; i++){
            if (A[i] % 2 == 0) {
                prefixSumOfEvenNumbers[i] = prefixSumOfEvenNumbers[i-1] + 1;
            } else {
                prefixSumOfEvenNumbers[i] = prefixSumOfEvenNumbers[i-1] + 0;
            }
        }

        // Now we can check for each query in the B array:
        int[] result = new int[B.length];
        for(int i = 0; i < B.length; i++){
            int L = B[i][0];
            int R = B[i][1];
            if(L == 0) result[i] = prefixSumOfEvenNumbers[R];
            else result[i] = prefixSumOfEvenNumbers[R] - prefixSumOfEvenNumbers[L-1];
        }
        return result;
    }
}
