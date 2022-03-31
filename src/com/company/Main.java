package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        palindromeCheck();
    }

    private static int getInt(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextInt();
    }

    private static void palindromeCheck() {
        int x = getInt("Enter an integer: ");
        int y = x;
        int z = 0;
        while (x != 0) {
            z = z * 10 + x % 10;
            x = x / 10;
        }
        if (y == z) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
