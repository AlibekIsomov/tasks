package arrays;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int h , i = 0;
        h = scanner.nextInt();
        while(i < n && arr[i] >= h) i++;
        System.out.println(i+1);
    }
}
