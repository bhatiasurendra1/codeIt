/***
Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.

Problem Constraints
1 <= A <= 103
1 <= B <= 109
1 <= C[i] <= 106

Input Format
The first argument is the integer A.
The second argument is the integer B.
The third argument is the integer array C.

Output Format
Return a single integer which denotes the maximum sum.
*/

public class MaximumSubarray {
    public int maxSubarray(int A, int B, int[] C) {
        int result = 0;
        for(int i = 0; i< A; i++){
            int max = 0;
            if (C[i] == B) return B;
            int sum = 0;
            for(int j = i; j<A; j++){
                sum += C[j];
                if(sum > B) break;
                if(sum > max) max = sum;
            }
            if(max > result) result = max;
        }
        return result;
    }
}
