package arrays;

import java.util.Scanner;

public class twoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            --r;
            --l;
            for(int j = l; j <= r; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
