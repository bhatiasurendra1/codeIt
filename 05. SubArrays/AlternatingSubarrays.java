/***
Problem Description

You are given an integer array A of length N comprising of 0's & 1's, and an integer B.
You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.
A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, 
while [1, 1] and [0, 1, 0, 0, 1] are not.


Problem Constraints
1 <= N <= 103
A[i] equals to 0 or 1.
0 <= B <= (N - 1) / 2

Input Format
First argument is an integer array A.
Second argument is an integer B.


Output Format
Return an integer array containing indices(0-based) in sorted order. If no such index exists, return an empty integer array.
*/
public class AlternatingSubarrays {
    public int[] solve(int[] A, int B) {
        ArrayList<Integer> indicesArray = new ArrayList<Integer>();
         if(B == 0) { // For B = 0, B*2+1 = 1 so all element indices will be the subArrays we need.
            for(int i = 0; i < A.length; i++) {
                indicesArray.add(i);
            }
        } else {
            int startIndex = 0;
            int endIndex = 1; 
            while(startIndex < A.length && endIndex < A.length) {
                if(A[endIndex] == A[endIndex-1] ){ // If consecutive elements are same, we move the startIndex to endIndex position.
                    startIndex = endIndex; 
                } else if(endIndex - startIndex == B*2) { // If the elements between startIndex and endIndex are alternating, and their difference is the desired subArray size, we add this index to indicesArray.
                    indicesArray.add(startIndex + B);
                    startIndex++;
                }
                endIndex++;
            }
        }

        // now lets convert the answer array to desired return type.
        int[] indicesArr = new int[indicesArray.size()];
        for(int i = 0; i< indicesArray.size(); i++){
            indicesArr[i] = indicesArray.get(i);
        }
        return indicesArr;
    }
}
