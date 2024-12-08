package StringDataTypes.DataChar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FindZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        // Read input until EOF
        String line;
        while ((line = reader.readLine()) != null) {
            for (char c : line.toCharArray()) {
                if (c == '0') {
                    count++;
                }
            }
        }

        // Print the count of zeros
        System.out.println(count);
    }
}
