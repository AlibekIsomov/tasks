import java.util.Scanner;

public class CoinDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int x = -1, y = -1;

        for (int catCoins = N / 5; catCoins >= 0; catCoins--) {
            int remaining = N - (5 * catCoins);
            if (remaining % 3 == 0) {
                int foxCoins = remaining / 3;
                x = foxCoins;
                y = catCoins;
                break;
            }
        }

        if (x != -1 && y != -1) {
            System.out.println(y + " " + x);
        }

        scanner.close();
    }
}
