import java.util.Scanner;

/*
 * Complexity work:
 * n = length of s.
 *
 * Equation:
 * T(n) = T(n-1) + c
 *
 * T(n) = O(n)
 */

public class Question1 {

    public static int recursiveLength(String s) {
        if (s.equals("")) {
            return 0;
        }
        return 1 + recursiveLength(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int length = recursiveLength(s);

        System.out.println("Length of string = " + length);

        /*
         * Test Cases:
         * 1. Empty string - length = 0
         * 2. "Recursion" - length = 9
         * 3. "STR123" - length = 6
         */
    }
}
