/* Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.

Problem Constraints
1 <= A <= 106
Input Format
First and only argument contains a single positive integer A.
Output Format
Return 1 if A is a perfect number and 0 otherwise.
*/

public class Solution {
    public int solve(int A) {
        int count = 0;
        for(int i = 1; i < A; i++){
            if(A%i == 0) {
                count = count + i;
            }
        }
        if(count == A) {
            return 1;
        } else {
            return 0;
        }
    }
}
