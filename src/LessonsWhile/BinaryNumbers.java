package LessonsWhile;

import java.nio.channels.SelectionKey;
import java.util.Scanner;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if (n > 0 && (n & (n - 1)) == 0) {
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }

    }
}
