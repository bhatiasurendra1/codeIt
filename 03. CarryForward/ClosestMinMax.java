/***
Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array and at least one occurrence of the minimum value of the array.

Problem Constraints
1 <= |A| <= 2000

Input Format
First and only argument is vector A

Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
***/


public class ClosestMinMax {
    public int findClosestMinMax(int[] A) {
        int min = findMin(A);
        int max = findMax(A);
        if(max == min) return 1;
        
        int ans = A.length;
        int min_i= -1; int max_i = -1; int length = 0;
        for(int i = A.length - 1; i >=0 ; i--){
            if(A[i] == min){
                min_i = i;
                if(max_i != -1){
                    length = max_i - min_i + 1;
                    if(length < ans) ans = length;
                }
            } else if (A[i] == max){
                max_i = i;
                if(min_i != -1){
                    length = min_i - max_i + 1;
                    if(length < ans) ans = length;
                }
            }
        }
        return ans;
    }
    
    private int findMin(int[] A) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i] < min) min = A[i];
        }
        return min;
    }

     private int findMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i] > max) max = A[i];
        }
        return max;
    }
}
