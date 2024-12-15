package arrays;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoTimesReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            a.add(i + 1);
        }

        for (int i = 0; i < 2; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            Collections.reverse(a.subList(L - 1, R));
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        scanner.close();
    }
}
