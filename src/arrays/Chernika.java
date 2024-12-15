package arrays;

import java.util.Scanner;

public class Chernika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of elements
        int[] a = new int[n];
        for (int i = 0; i < n; i++) { // Read the array elements
            a[i] = scanner.nextInt();
        }

        // Handle cases where the size of the array is less than 3
        if (n == 1) {
            System.out.println(a[0]);
            return;
        }
        if (n == 2) {
            System.out.println(a[0] + a[1]);
            return;
        }

        // General case: Calculate the maximum sum of three adjacent elements
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            // Use modular arithmetic to handle circular indexing
            int sum = a[i] + a[(i + 1) % n] + a[(i + 2) % n];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum); // Output the result
    }
}