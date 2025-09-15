// Write a program to check String is palindrom or not

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        // reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // check palindrome
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }

        sc.close();

    }
}
