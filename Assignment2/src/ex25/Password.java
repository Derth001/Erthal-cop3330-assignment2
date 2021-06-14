/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class Password {


    public static void passwordValidator(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLetter = false, hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isAlphabetic(i))
                hasLetter = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // Strength of password
        if (hasLetter && hasDigit && specialChar && (n >= 8))
            System.out.print("The password '" + input + "' is a very strong password.");
        else if (hasLetter && hasDigit && (n >= 8))
            System.out.print("The password '" + input + "' is a strong password.");
        else if (hasLetter && (n < 8))
            System.out.print("The password '" + input + "' is a weak password.");
        else if (hasDigit && (n < 8))
            System.out.print("The password '" + input + "' is a very weak password.");
        else
            System.out.println("Invalid Password");
    }

    public static void main(String[] args)
    {
        System.out.println("Please Input Password");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        passwordValidator(input);
    }


}