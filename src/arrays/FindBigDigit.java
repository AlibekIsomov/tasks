package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBigDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        l--;
        r--;

        int max= l;
        for(int i = l +1; i <= r; i++){
            if(list.get(i)>list.get(max)){
                max=i;
            }
        }
        System.out.println(list.get(max) + " " + (max+1));
        scanner.close();
    }
}
