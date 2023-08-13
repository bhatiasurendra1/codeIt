/***
Pick from both sides!

Problem Description
You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.
NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
    Remove 3 elements from front and 0 elements from the back, OR
    Remove 2 elements from front and 1 element from the back, OR
    Remove 1 element from front and 2 elements from the back, OR
    Remove 0 elements from front and 3 elements from the back.

Problem Constraints
1 <= N <= 105
1 <= B <= N
-103 <= A[i] <= 103

Input Format
First argument is an integer array A.
Second argument is an integer B.

Output Format
Return an integer denoting the maximum possible sum of elements you removed.
**/

public class PickFromBothSides {
    public int pickFromBothSides(int[] A, int B) {
       int sum = 0;
        int result = 0;
        for(int i = 0; i < B; i++){
            result += A[i];
        }
        sum = result;
        for(int i=0; i < B; i++){
            sum -= A[B-i-1];
            sum += A[A.length-i-1];
            result = Math.max(sum, result);
        }
        return result;
    }
}
