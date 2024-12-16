package arrays;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int oddCount = 0;
        int evenCount = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int x : a) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                oddCount++;
            }
        }

        System.out.println();

        for (int x : a) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                evenCount++;
            }
        }
        System.out.println();
        System.out.println(evenCount >= oddCount ? "YES" : "NO");

        scanner.close();
    }
}