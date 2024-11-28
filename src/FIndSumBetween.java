import java.util.Scanner;

public class FIndSumBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long sum = 0;
        for (long i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


}