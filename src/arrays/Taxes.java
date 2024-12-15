package arrays;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int index= 0;
        for(int i = 0; i < n; i++){
            if(a[i] * b[i] > a[index] * b[index]){
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}
