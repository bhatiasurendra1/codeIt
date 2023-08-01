/**
* Count number of factors for a non zero positive number
*/

import java.lang.Math;

public class CountFactors {
    public int countFactors(int A) {
        int count = 0;
        int i=1 ;
        for(;i <= Math.sqrt(A) ; i++){
                if(A%i == 0) {
                    count += 2;
            }
        }
        if((i-1)*(i-1) == A) count--;
        return count;
    }
}
