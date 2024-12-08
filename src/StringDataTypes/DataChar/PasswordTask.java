package StringDataTypes.DataChar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PasswordTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = reader.readLine(); // Read the password input

        boolean hasLower = false; // Check for lowercase letters
        boolean hasUpper = false; // Check for uppercase letters
        boolean hasDigit = false; // Check for digits

        // Check each character
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = true; // Check if it's lowercase
            if (Character.isUpperCase(c)) hasUpper = true; // Check if it's uppercase
            if (Character.isDigit(c)) hasDigit = true;     // Check if it's a digit
        }

        // Validate conditions
        if (hasLower && hasUpper && hasDigit && password.length() >= 12) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
