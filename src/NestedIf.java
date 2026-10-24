public class NestedIf {
    public static void main(String[] args) {

        int x = 221;

        if (x % 13 == 0) {
            System.out.println("x is divisible by 13.");

            if (x % 17 == 0) {
                System.out.println("x is divisible by 17.");
            } else {
                System.out.println("x is not divisible by 17.");
            }

        } else {
            System.out.println("x is not divisible by 13.");
        }
    }
}