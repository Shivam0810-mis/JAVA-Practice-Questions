class Learn {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 10;  // Find sum of primes up to 20
        int sum = 0;

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + " = " + sum);
    }
} 
 