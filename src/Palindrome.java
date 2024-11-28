import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(isPalindrome(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
        public static boolean isPalindrome(int number) {
            int firstDigit = number / 1000;
            int secondDigit = (number / 100) % 10;
            int thirdDigit = (number / 10) % 10;
            int fourthDigit = number % 10;

            // Check if the number is a palindrome
            return (firstDigit == fourthDigit) && (secondDigit == thirdDigit);
        }

}


