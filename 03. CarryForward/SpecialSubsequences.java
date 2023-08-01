/***
Problem Description
You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.
NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

Problem Constraints
1 <= length(A) <= 105

Input Format
First and only argument is a string A.

Output Format
Return an integer denoting the answer.
***/
public class SpecialSubsequences {
    public int findSpecialSubsequencesAG(String A) {
        int modulo = 1000000007;
        int c = 0;
        int ans = 0;
        for(int i = A.length() - 1; i >=0 ; i--){
            if(A.charAt(i) == 'G') c++;
            if(A.charAt(i) == 'A') ans = ans + c;
            ans = ans % modulo;
        }
        ans = ans % modulo;
        return ans;
    }
}
