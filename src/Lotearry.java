import java.util.Scanner;

public class Lotearry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int b = a / 1000;
        int c = a % 1000;
        int firstThree = sumDigits(b);
        int secondThree = sumDigits(c);

        if (firstThree == secondThree) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}