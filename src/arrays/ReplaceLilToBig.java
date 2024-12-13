package arrays;

import java.util.Scanner;

public class ReplaceLilToBig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int mx = -1001, mn = 1001;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > mx) {
                mx = a[i];
            }
            if (a[i] < mn) {
                mn = a[i];
            }
        }
        for(int i = 0; i < n; i++){
            if (a[i] == mx) {
                a[i] = mn;
            }
        }
        for (int x : a) {
            System.out.print(x + " ");
        }

        scanner.close();
    }
}
