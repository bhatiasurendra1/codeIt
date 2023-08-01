/**
* Check if a given number is Prime or not
*/

public class PrimeNumber {
    public boolean isPrime(Long A) {
        if(countFactors(A) == 2){
            return true;
        } else {
            return false;
        }
    }

// We are reusing the countFactors method from factor count problem
     public int countFactors(Long A) {
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
