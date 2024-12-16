package arrays;

import java.util.Collections;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min =0;
        int max =0;
        int s = 0;
        int p = 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        if(a[i] > 0) s+=a[i];
        if(a[i] > a[max]) max = i;
        if(a[i] < a[min]) min = i;
        }

        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        for(int i = min + 1; i < max; i++) p*=a[i];
        System.out.println(s + " " + p);
        scanner.close();

    }
}
