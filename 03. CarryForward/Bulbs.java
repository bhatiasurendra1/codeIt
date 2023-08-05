/***
Problem Description

A wire connects N light bulbs.
Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
You can press the same switch multiple times.
Note: 0 represents the bulb is off and 1 represents the bulb is on.


Problem Constraints
0 <= N <= 5×105
0 <= A[i] <= 1

Input Format
The first and the only argument contains an integer array A, of size N.

Output Format
Return an integer representing the minimum number of switches required.
*/

public class Bulbs {
    public int bulbs(int[] A) {
        int count = 0;
        if(A.length == 0) return 0;
        if(A[0] == 0) count++;
        for(int i=1; i< A.length; i++){
            if(A[i] != A[i-1]) count++;
        }
        return count;
    }
}
