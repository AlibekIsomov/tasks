package StringDataTypes.DataChar;

import java.util.Scanner;

public class FindZeros {
    public static void main(String[] args) {
        int cnt = 0;

        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        for (char ch : c.toCharArray()) {
            if (ch == '0') {
                cnt++;
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}

