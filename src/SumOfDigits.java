public class SumOfDigits {
    public static void main(String[] args) {

        int number = 7584;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}