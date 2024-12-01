package binarySearchLessons;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = 1, r = 10000, x;
        char c;

        while (true) {
            x = (l + r) / 2;
            System.out.println(x);
            System.out.flush();

            c = scanner.next().charAt(0);

            if (c == '<') {
                r = x - 1;
            } else if (c == '>') {
                l = x + 1;
            } else {
                break;
            }
        }

        scanner.close();
    }
}
