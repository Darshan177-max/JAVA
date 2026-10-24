public class HelloWorld {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5 && b < 5) = " + (a > 5 && b < 5));
        System.out.println("(a > 5 || b > 5) = " + (a > 5 || b > 5));
        System.out.println("!(a > b) = " + !(a > b));

        // Assignment Operator
        System.out.println("\nAssignment Operators:");
        int x = 10;
        x += 5;
        System.out.println("x += 5 = " + x);

        // Increment and Decrement
        System.out.println("\nIncrement and Decrement:");
        x++;
        System.out.println("x++ = " + x);

        x--;
        System.out.println("x-- = " + x);
    }
}