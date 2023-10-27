public class SumOfPrimeInFibonacci {

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the sum of prime numbers in Fibonacci series up to a limit
    static int sumOfPrimeInFibonacci(int limit) {
        int a = 0, b = 1, c, sum = 0;
        while (b <= limit) {
            // Check if 'b' is prime and add it to the sum if true
            if (isPrime(b)) {
                sum += b;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return sum;
    }

    public static void main(String[] args) {
        int limit = 100; // You can change the limit according to your requirement
        int sum = sumOfPrimeInFibonacci(limit);
        System.out.println("Sum of prime numbers in Fibonacci series up to " + limit + " is: " + sum);
    }
}
