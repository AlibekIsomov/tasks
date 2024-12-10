package StringDataTypes.DataChar;

import java.util.Scanner;

public class SimpleShifr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        while (scanner.hasNext()) {
            c = scanner.next().charAt(0);
            System.out.print((c == 'z' ? 'a' : (char) (c + 1)));
        }
        scanner.close();
    }
}

