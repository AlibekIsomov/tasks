package StringDataTypes.DataString;

import java.util.Scanner;

public class Flowers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s%3 == 0){
            System.out.println("GCV");
        }
        else if(s%3 == 1){
            System.out.println("VGC");
        }
        else {
            System.out.println("CVG");
        }
    }
}
