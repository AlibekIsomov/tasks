package StringDataTypes.DataChar;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c;
        int cnt= 0, res= 0;
        while(sc.hasNext()){
            c = sc.next().charAt(0);
            res = Math.max(res,cnt = (c=='0' ? cnt +1 : 0));
        }
    }
}
