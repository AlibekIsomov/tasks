package StringDataTypes.DataChar;

import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = n - a - b;

        for (int i = 0; i < a; ++i) {
            System.out.print((char) ('A' + (i&1)));
        }
        for (int i = 0; i < b;++i) {
            System.out.print((char) ('a' + (i&1)));
        }

        for (int i = 0; i < c; ++i) {
            System.out.print((char) ((i&1)));
        }

        scanner.close();
    }
}
