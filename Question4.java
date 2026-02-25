import java.util.Scanner;

/*
 * Complexity Work:
 * n = num of digits(D) in N.
 *
 * Equation:
 * T(n) = T(n-1) + c
 *
 * Complexity:
 * T(n) = O(n)
 */

public class Question4 {

    public static int countDigit(long N, int D) {
        if (N == 0) {
            return 0;
        }

        int lastDigit = (int)(N % 10);

        if (lastDigit == D) {
            return 1 + countDigit(N / 10, D);
        } else {
            return countDigit(N / 10, D);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (long): ");
        long N = input.nextLong();

        System.out.print("Enter a digit (0-9): ");
        int D = input.nextInt();

        int result = countDigit(N, D);

        System.out.println("Digit " + D + " appears " + result + " times.");

        /*
         * Test Cases:
         * 1. N = 12345678, D = 8 -> 1
         * 2. N = 88888, D = 8 -> 5
         * 3. N = 312458713476217354872163548721, D = 8 -> 3
         */
    }
}
