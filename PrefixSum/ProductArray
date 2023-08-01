/****
* Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
*
* Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
*
* Input Format
* The only argument given is the integer array A.
*
*Output Format
* Return the product array.
*
* Constraints
* 2 <= length of the array <= 1000
* 1 <= A[i] <= 10
*
***/

public class ProductArray {
    public int[] productArray(int[] A) {
        int[] preProd = new int[A.length];
        int[] sufProd = new int[A.length];
    // Calculate Prefix Product Array
        preProd[0] = A[0];
        for(int i = 1; i < A.length; i++){
            preProd[i] = preProd[i-1] * A[i];
        }

    // Calculate Suffix Product Array
        sufProd[A.length - 1] = A[A.length - 1];
        for(int i = A.length-2; i>0 ; i--){
            sufProd[i] = sufProd[i+1] * A[i];
        }

    // Calculate the result Array
        int[] prodArr = new int[A.length];
        prodArr[0] = sufProd[1];
        prodArr[A.length - 1] = preProd[A.length - 2];
        for(int i = 1; i < A.length - 1; i++){
            prodArr[i] = (sufProd[i + 1]*preProd[i - 1]);
        }
        return prodArr;
    }
}
