/***
Problem Description
Given an array of size N, find the subarray of size K with the least average.

Problem Constraints
1<=k<=N<=1e5
-1e5<=A[i]<=1e5

Input Format
First argument contains an array A of integers of size N.
Second argument contains integer k.

Output Format
Return the index of the first element of the subarray of size k that has least average.
Array indexing starts from 0.
*/

public class SubarrayWithLeastAverage {
    public int findSubarrayWithLeastAverage(int[] A, int B) {
        float windowSum = 0;
        for(int i = 0; i < B; i++){
            windowSum += A[i];
        }
        int startIndex = 0;
        int endIndex = B;
        int start = 0;
        float average = windowSum / B;
        while(endIndex < A.length){
            windowSum = windowSum - A[startIndex] + A[endIndex];
            startIndex++;
            float newAverage = windowSum / B;
            if(newAverage < average){
                average = newAverage;
                start = startIndex;
            }
            endIndex++;
        }
        return start;
    }
}
