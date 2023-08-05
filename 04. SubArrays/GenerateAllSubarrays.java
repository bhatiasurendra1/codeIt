/***
Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.


Problem Constraints
1 <= N <= 100
1 <= A[i] <= 105

Input Format
First argument A is an array of integers.

Output Format
Return a 2D array of integers in any order.
*/

public class GenerateAllSubarrays {
    public int[][] generateAllSubarrays(int[] A) {
        ArrayList<int[]> arrayOfSubArrays = new ArrayList<int[]>();
        for(int i = 0; i < A.length; i++) {
            for(int j = i; j < A.length; j++) {
                int[] subArrays = new int[j-i+1];
                for(int k = i, l = 0; k <= j; k++, l++) {
                    subArrays[l] = A[k];
                }
                arrayOfSubArrays.add(subArrays);
            }
        }
        int[][] subArraysList = new int[arrayOfSubArrays.size()][];
        for(int i = 0; i< arrayOfSubArrays.size(); i++){
            subArraysList[i] = arrayOfSubArrays.get(i);
        }
        return subArraysList;
    }
}
