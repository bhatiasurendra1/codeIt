/***
Problem Description

You are given a n x n 2D matrix A representing an image. Rotate the image by 90 degrees (clockwise). You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.

Problem Constraints
1 <= n <= 1000

Input Format
First argument is a 2D matrix A of integers

Output Format:
Return the 2D rotated matrix.
Example:
Input:
A= [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 ]
Output:
A= [
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
]
*/

public class RotateMatrix {
    public int[][] rotateMatrix(int[][] A) {
        int N = A.length;
      // We can first transpose the matrix
        for(int i = 0; i< N; i++){
            for(int j = i+1; j < N; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
      // Now We can reverse each row of the matrix
        for(int row = 0; row < N; row++){
            int i = 0; int j = N-1;
            while(i < j){
                int temp = A[row][i];
                A[row][i] = A[row][j];
                A[row][j] = temp;
                i++;
                j--;
            }
        }
        return A;
    }
}
