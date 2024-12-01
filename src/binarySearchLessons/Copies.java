package binarySearchLessons;

import java.util.Scanner;

public class Copies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, x, y;
        n = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > y) { // Ensure x is less than or equal to y
            int temp = x;
            x = y;
            y = temp;
        }

        int l = x;
        int r = 540;
        int t;

        while (l < r) {
            t = (l + r) / 2; // Calculate the midpoint
            // Check if the number of items that can be processed in `t` time is >= n
            if (t / x + (t - x) / y >= n) {
                r = t; // Reduce the upper bound
            } else {
                l = t + 1; // Increase the lower bound
            }
        }

        System.out.println(l); // Print the result
        scanner.close();
    }
}
// 267#
