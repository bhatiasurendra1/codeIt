/*
Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Problem Constraints
1 <= A <= 108
*/

public class Solution {
    public int solve(int A) {
        for(int i = 1; i*i <= A; i++){ // We only need to traverse not more than sqrt of A
            if(i*i == A){
                return i;
            }
        }
        return -1;
    }
}
