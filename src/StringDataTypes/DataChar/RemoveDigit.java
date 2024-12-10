package StringDataTypes.DataChar;

import java.util.Scanner;

public class RemoveDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c != '4' && c != '7') {
                result.append(c);
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
