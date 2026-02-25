import java.util.Scanner;

/*
 * Complexity Work:
 *
 * n = length of s.
 *
 * Equation
 * T(n) = T(n-1) + c
 *
 * T(n) = O(n)
 *
 * Since substring() has a cost of O(n):
 * Complexity = O(n^2)
 */

public class Question2 {

    public static int countChar(String s, char c) {
        if (s.equals("")) {
            return 0;
        }

        if (s.charAt(0) == c) {
            return 1 + countChar(s.substring(1), c);
        } else {
            return countChar(s.substring(1), c);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);

        int result = countChar(s, c);

        System.out.println("Character '" + c + "' appears " + result + " times.");

        /*
         * Test Cases:
         * 1. S = "mmmmm", C = 'm' → 5
         * 2. S = "Recursion", C = 'z' → 0
         * 3. S = "toooooool", C = 'o' → 7
         */
    }
}
