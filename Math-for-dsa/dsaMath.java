public class dsaMath {
    public static void main(String[] args) {
        // System.out.println(isPrime(274));
        // 1. Seive of eratosthenes
        int n = 100;
        int[] primes = new int[n + 1];
        seive(n, primes);


    }

    // Prime numbers
    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /* This is not optimised, so we use Seive of eratosthenes Algorithm. */

    /*
     * Seive of Eratosthenes Algorithm.
     * 1. We take an array of size n and set all them to 1.
     * 2. Then we loop from 2 to n, and mark the multiples of them with 0.
     * 3. Then we print the elements for which the value is 1.
     */

    public static void seive(int n, int[] primes) {
        for (int i = 2; i <= n; i++) {
            primes[i] = 1;
        }

        // Optimisation: instead of running till N we can run till root of n.
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == 1) {

                // we can omit the repeating mulitplication factors
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = 0;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 1) {
                System.out.println("Primes: " + i);
            }
        }
        // Time complexity: O(N * Log(LogN))
        // Space complexity: O(N)

    }
}


