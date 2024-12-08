package StringDataTypes.DataChar;

import java.util.Scanner;

public class ChangeLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char n = sc.next().charAt(0);

        if(n >= 'a' && n<='z'){
            n-=32;
        }
        else if(n >= 'A' && n<='Z'){
            n+=32;
        }
        System.out.println(n);
    }
}
