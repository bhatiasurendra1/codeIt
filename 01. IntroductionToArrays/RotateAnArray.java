/**
* Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
* 
* Problem Constraints
* 1 <= N <= 105
* 1 <= A[i] <=109
* 1 <= B <= 109
* 
* Input Format
* The first argument given is the integer array A. The second argument given is the integer B.
*
* Output Format
* Return the array A after rotating it B times to the right
**/

public class RotateAnArray {
    public int[] rotateArray(int[] A, int B) {
        B = B % A.length;
        A = reverseArray(A, 0, A.length - 1);
        A = reverseArray(A, 0, B-1);
        A = reverseArray(A, B, A.length - 1);
        return A;   
    }

    private int[] reverseArray(int[] A, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = A[startIndex];
            A[startIndex] = A[endIndex];
            A[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return A;
    }
}

