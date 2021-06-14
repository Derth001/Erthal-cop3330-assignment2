/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex32;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String str[]) {
        int numPalyers = 0;
        int number = 0;
        int guessNumber = 0;
        boolean quit = false;
        Random randomGenerator = new Random();
        Scanner sca = new Scanner(System.in);
        while(!quit) {
            int count = 0;
            System.out.println("Enter Difficulty Level (1, 2, or 3):");
            String level = sca.next();

            if (level.equals("1")) {
                System.out.println("Guess a number between 1-10: ");
                number = randomGenerator.nextInt(10) + 1;
            } else if (level.equals("2")) {
                System.out.println("Guess a number between 1-100: ");
                number = randomGenerator.nextInt(100) + 1;
            } else if (level.equals("3")) {
                System.out.println("Guess a number between 1-1000: ");
                number = randomGenerator.nextInt(1000) + 1;
            }

            guessNumber = sca.nextInt();
            count++;
            while (guessNumber != number) {
                if (guessNumber > number) {
                    System.out.println("Too high. Guess again: ");
                } else {
                    System.out.println("Too low. Guess again: ");
                }
                guessNumber = sca.nextInt();
                count++;
            }
            System.out.println("Correct!");

            System.out.println("It took you " + count + " guess to win, Congratulations!");

            System.out.println("Would you like to play again? (Y/N)");
            String again = sca.next();


            if (again.equals("Y"))
                continue;
             else if (again.equals("N")) {
                quit = true;
            }
        }
        System.out.println("Thanks For Playing");
    }
}
