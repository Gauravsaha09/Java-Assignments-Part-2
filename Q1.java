
import java.util.Scanner;

// Write a program to check number is palindrom or not

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num>0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
