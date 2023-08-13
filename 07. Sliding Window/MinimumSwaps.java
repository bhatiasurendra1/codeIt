/***
Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.



Problem Constraints

1 <= length of the array <= 100000
-109 <= A[i], B <= 109


Input Format

The first argument given is the integer array A.
The second argument given is the integer B.


Output Format

Return the minimum number of swaps.
*/
public class MinimumSwaps {
    public int countMinimumSwapsRequired(int[] A, int B) {
        int windowSize = 0;
        int minSwapsRequired = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]<= B) windowSize++;
        }

        if(windowSize == 0 || windowSize == 1 || windowSize == A.length) return 0;

        for(int i = 0; i < windowSize; i++) {
            if(A[i]> B) minSwapsRequired++;
        }

        int ans = minSwapsRequired;

        int startIndex = 1; int endIndex = windowSize;
        while (endIndex < A.length){
            if(A[startIndex -1] > B) minSwapsRequired--;
            if(A[endIndex] > B) minSwapsRequired++;
            startIndex++;
            endIndex++;
            if(ans > minSwapsRequired) ans = minSwapsRequired;
        }
        return ans;
    }
}
