/***
* Problem Description
* You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
*
* Problem Constraints
*
* 1 <= |A| <= 105
* 0 <= A[i] <= 109
*
* Input Format
* The first argument is an integer array A.
*
* Output Format
* Return the second largest element. If no such element exist then return -1.
***/

public class SecondLargestElementInArray {
    public int findSecondLargestElementInArray(int[] A) {
        int largest = A[0];
        int secondLargest = -1;
        for(int i = 1; i< A.length; i++){
            if(A[i] > largest){
                secondLargest = largest;
                largest = A[i];
            } else {
                if (secondLargest < A[i] && A[i] < largest) {
                secondLargest = A[i];
                }
            }
        }
        return secondLargest;
    }
}
