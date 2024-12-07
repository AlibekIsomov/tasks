package LessonsWhile;

import java.util.Scanner;

public class FindMinimalDividel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (n%i !=0) {
            i++;
        }
        System.out.println(i);
    }
}
