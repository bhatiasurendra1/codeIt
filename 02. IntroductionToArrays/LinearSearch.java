/***
* Problem Description
* Given an array A and an integer B, find the number of occurrences of B in A.
* 
* Problem Constraints
* 1 <= B, Ai <= 109
* 1 <= length(A) <= 105
*
* Input Format
* Given an integer array A and an integer B.
* 
* Output Format
* Return an integer, number of occurrences of B in A.
***/

public class LinearSearchInAnArray {
    public int linearSearch(int[] A, int B) {
        int numberOfOccurances = 0;
        for(int i : A){ // I have used for each loop. You can use standard for loop too.
            if(i == B) numberOfOccurances++;
        }
        return numberOfOccurances;
    }
}
