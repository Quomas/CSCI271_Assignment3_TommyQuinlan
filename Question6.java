import java.util.Scanner;

/*
 * Complexity Work:
 * n = size of array.
 *
 * Equation:
 * T(n) = T(n-1) + c
 *
 * Complexity:
 * T(n) = O(n)
 */

public class Question6 {

    public static int sumEven(int[] A, int n) {
        // base case (if nothing is left sum is 0)
        if (n == 0) {
            return 0;
        }
        // if the last number is even add it to the recursion if not then just call the function again
        if (A[n - 1] % 2 == 0) {
            return A[n - 1] + sumEven(A, n - 1);
        } else {
            return sumEven(A, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] A = new int[size];

        System.out.println("Enter integers:");
        for (int i = 0; i < size; i++) {
            A[i] = input.nextInt();
        }

        int result = sumEven(A, size);

        System.out.println("Sum of even numbers = " + result);

        /*
         * Test Cases:
         * 1. [1,2,3,4,5,6] = 12
         * 2. [1,3,7] = 0
         * 3. [2,4,6,8] = 20
         */
    }
}
