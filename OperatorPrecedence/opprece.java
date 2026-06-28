

public class opprece {
     public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 2 + 3 * 4 - 1;

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("20 / 2 + 3 * 4 - 1 = " + result3);

        System.out.println("\nOrder of Precedence:");
        System.out.println("1. Parentheses ()");
        System.out.println("2. Multiplication, Division");
        System.out.println("3. Addition, Subtraction");
    }
}
