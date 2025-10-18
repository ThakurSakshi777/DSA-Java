//Counting vowels in a string
package String;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // Input
            System.out.println("Enter the string");
            String str = sc.nextLine();
            int n = str.length();

            // Solution
            int count = 0;
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);

                // check for vowels (both upper and lower case)
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println("Number of vowels in the string: " + count);

        }
    }
}
