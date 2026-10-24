public class FactorialFirst10 {
    // Method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Loop through numbers 1 to 10
        for (int num = 1; num <= 10; num++) {
            System.out.println("Factorial of " + num + " = " + factorial(num));
        }
    }
}