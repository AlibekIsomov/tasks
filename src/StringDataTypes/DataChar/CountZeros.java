package StringDataTypes.DataChar;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int cnt= 0, res= 0;
        for(char ch : c.toCharArray()){
            if (ch == '0') {
                cnt++;
                res = Math.max(res, cnt);
            } else {
                cnt = 0;
            }
        }
        System.out.println(res);
    }
}
