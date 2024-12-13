package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                count++;
            }
        }
//         long count = list.stream().filter(num -> num == x).count();
        System.out.println(count);
    }
}
