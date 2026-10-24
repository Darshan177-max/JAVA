public class FactorialWhileLoop {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 10) {
            long factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " = " + factorial);
            num++;
        }
    }
}