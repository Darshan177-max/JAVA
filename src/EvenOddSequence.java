public class EvenOddSequence {
    public static void main(String[] args) {

        int number = 22;

        System.out.println("Sequence:");

        while (number != 1) {

            System.out.print(number + " -> ");

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
        }

        System.out.println(1);
    }
}