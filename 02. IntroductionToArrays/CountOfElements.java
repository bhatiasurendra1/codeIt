/*** Problem Description
* Given an array A of N integers. 
* Count the number of elements that have at least 1 elements greater than itself.
*
* Problem Constraints
* 1 <= N <= 105
* 1 <= A[i] <= 109
*
* nput Format
* First and only argument is an array of integers A.
*
* Output Format
* Return the count of elements.
***/

public class CountOfElements {
    public int countElements(int[] A) {
        int maxi = 0;
        int countOfMaxi = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > maxi) {
                maxi = A[i];
                countOfMaxi = 1;
            } else if (A[i] == maxi) {
                countOfMaxi++;
            }
        }
        return A.length - countOfMaxi;
    }
}
