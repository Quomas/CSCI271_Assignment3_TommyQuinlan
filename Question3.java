import java.util.Scanner;

/*
 * Complexity Work:
 * 
 * n = size of array.
 *
 * Equation:
 * T(n) = T(n-1) + c
 *
 * Complexity = O(n)
 */

public class Question3 {

    public static int max(int[] A, int n) {
        //base case
        if (n == 1) {
            return A[0];
        }

        int maxRest = max(A, n - 1);
        // find max number with recursion
        return (A[n - 1] > maxRest) ? A[n - 1] : maxRest;
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

        int maximum = max(A, size);

        System.out.println("Maximum value = " + maximum);

        /*
         * Test Cases:
         * 1. [1,2,3,4,5] - 5
         * 2. [-7,-1,-4] - -1
         * 3. [100] - 100
         */
    }
}
