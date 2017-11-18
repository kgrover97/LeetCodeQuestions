
public class PrimeCount {

    static int countPrimes(int n) {
        boolean[] primeArray = new boolean[n];
        int count = 0;
        // Put true into the whole array
        for (int i = 2; i < n; i++) {
            primeArray[i] = true;
        }
        // Starting at 2 put all multiples of that number set to false
        // We stop at j*j < n becuase n is not divisible by anything after n/2 and if
        // n = p * q then we only need to determine if any of the values up to p < sqrt(n)
        // are factors of n becuase checking the other half would be repetitive
        for (int j = 2; j * j < n; j++) {
            //Add factors in
            for (int k = j * j; k < n; k += j) {
                primeArray[k] = false;
            }
        }
        // count how many trues
        for (int x = 1; x < n; x++) {
            if (primeArray[x]) count++;
        }

        return count;
    }
}
