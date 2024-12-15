package arrays;

import java.util.Scanner;

public class MoveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int id = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if(a[i] == 1) id = i;
        }
        for(int i = id; i < n ; i++ ) System.out.print(a[i] + " ");
        for(int i = 0; i < id ; i++) System.out.print(a[i] + " ");
        scanner.close();

    }
}
