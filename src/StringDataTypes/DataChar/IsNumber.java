package StringDataTypes.DataChar;

import java.util.Scanner;

public class IsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if(x >= '0' && x<='9'){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
