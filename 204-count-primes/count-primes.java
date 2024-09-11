class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

        int[] isPrime = new int[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = 1; // Assume all numbers are prime initially
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]==1) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = 0; // Mark multiples of i as non-prime
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]==1) {
                count++;
            }
        }

        return count;
    }
}