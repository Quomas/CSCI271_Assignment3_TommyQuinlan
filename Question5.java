import java.util.Scanner;

/*
 * Complexity Work:
 * n = length of s.
 *
 * Equation:
 * T(n) = T(n-1) + c
 *
 * Simplified
 * T(n) = O(n)
 *
 * Since substring is used again we must include its cost of O(n)
 * Complexity: O(n^2)
 */

public class Question5 {

    public static String reverse(String s) {
        // base case (empty string)
        if (s.equals("")) {
            return "";
        }
        // Reverse the string recursively using the substring function
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String reversed = reverse(s);

        System.out.println("Reversed string = " + reversed);

        /*
         * Test Cases:
         * 1. "recursive" -> "evisrucer"
         * 2. "ab" -> "ba"
         * 3. "" -> ""
         */
    }
}
