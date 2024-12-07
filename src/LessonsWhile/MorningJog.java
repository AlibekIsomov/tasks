package LessonsWhile;
import java.util.Scanner;

public class MorningJog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();

        double distance = x;
        long day = 1;

        while (distance < y) {
            day++;
            distance += (distance * 15) / 100;
        }

        System.out.println(day);
    }
}