package binarySearchLessons;

import java.util.Scanner;

public class CosmosSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long w = scanner.nextLong();
        long h = scanner.nextLong();
        long L = 0, R = (long) 1e18;

        while (L < R) {
            long d = (L + R + 1) >> 1;
            if (Math.max((w / (a + 2 * d)) * (h / (b + 2 * d)), (h / (a + 2 * d)) * (w / (b + 2 * d))) >= n) {
                L = d;
            } else {
                R = d - 1;
            }
        }

        System.out.println(L);
        scanner.close();
    }
}
//1397
