package StringDataTypes.DataString;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "qwertyuiopasdfghjklzxcvbnmq";
        char n = sc.next().charAt(0);
        int index = s.indexOf(n);
        System.out.println(s.charAt(index + 1));

        sc.close();
    }
}
