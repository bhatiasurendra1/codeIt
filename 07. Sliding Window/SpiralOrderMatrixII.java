/***
Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.

Problem Constraints
1 <= A <= 1000

Input Format
First and only argument is integer A

Output Format
Return a 2-D matrix which consists of the elements added in spiral order.
*/
public class SpiralOrderMatrixII {
    public int[][] generateMatrix(int A) {
        int[][] spiralMatrix = new int[A][A];
        int counter = 1;
        int n = A;
        int i = 0; int j = 0;
        while(n > 1){
            for(int k = 1; k <= n-1; k++){
                spiralMatrix[i][j] = counter;
                counter++;
                j++;
            }
            for(int k = 1; k <= n-1; k++){
                spiralMatrix[i][j] = counter;
                counter++;
                i++;
            }
            for(int k = 1; k <= n-1; k++){
                spiralMatrix[i][j] = counter;
                counter++;
                j--;
            }
            for(int k = 1; k <= n-1; k++){
                spiralMatrix[i][j] = counter;
                counter++;
                i--;
            }
            i++;
            j++;
            n = n-2;
        }
        if(n == 1){
            spiralMatrix[i][j] =  counter;
        }
        return spiralMatrix;
    }
}
