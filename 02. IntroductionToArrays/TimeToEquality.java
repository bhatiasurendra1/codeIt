/***
* Problem Description
* Given an integer array A of size N. In one second, you can increase the value of one element by 1.
* Find the minimum time in seconds to make all elements of the array equal.
* 
* Problem Constraints
* 1 <= N <= 1000000
* 1 <= A[i] <= 1000
*
* Input Format
* First argument is an integer array A.
*
* Output Format
* Return an integer denoting the minimum time to make all elements equal.
***/

public class TimeToEquality {

    public int timeToEquality(int[] A) {
        int timeToEquality = 0;
        int maximumElement = findMaximumElement(A);
        for(int i : A){
            timeToEquality += maximumElement - i;
        }
        return timeToEquality;
    }

    private int findMaximumElement(int[] A){
        int maximumElement = -1;
        for(int i : A){
            if(i > maximumElement) maximumElement = i;
        }
        return maximumElement;
    }
}
