package LessonsWhile;

import java.util.Scanner;

public class BankingPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt() *100 ;
        int p = sc.nextInt();
        int y = sc.nextInt() * 100;
        int years = 0;


        while (x < y) {
            x += (x * p) / 100;
            years++;
        }

        System.out.println(years);
    }
}
