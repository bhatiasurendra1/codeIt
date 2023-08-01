/*
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

Problem Constraints
0 <= n <= 10^3

Input Format
Single input parameter n in function.

Output Format
Return the count of prime numbers less than or equal to n.
*/

public class Solution {
    public int solve(int A) {
        int count = 0;
        for (int i = 2; i <= A; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int A) {
        for(int i = 2; i < A; i++) {
            if( A == 2 || A == 3 ){
                return true;
            }
            if(A % i == 0) {
                return false;
            }
        }
        return true;
    }

}
