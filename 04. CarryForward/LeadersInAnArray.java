/***
* Problem Description
* Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

* NOTE: The rightmost element is always a leader.
*
* Problem Constraints
* 1 <= N <= 105
* 1 <= A[i] <= 108
*
* Input Format
* There is a single input argument which a integer array A
*
* Output Format
* Return an integer array denoting all the leader elements of the array.
***/

public class LeadersInAnArray {
    public int[] findLeadersInAnArray(int[] A) {
        int max = A[A.length-1];
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        resultList.add(max);
        for (int i = A.length -2; i >= 0; i--){
            if(A[i] > max){
                max = A[i];
                resultList.add(max);
            }
        }
        return new resultList.toArray();
    }
}
