/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */

package ex35;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Random;

public class PickingWinner {
    // Objects
    public static Scanner scan = new Scanner(System.in);
    //Random rand = new Random();
    public static ArrayList<String> nameList = new ArrayList<String>();

    public static void main(String[] args) {
        String input;
        boolean quit = false;

        // Add names to a list until nothing is entered

        while (!quit){
            System.out.print("Enter a name: ");
            input = scan.nextLine();

            if (!input.equals("")){
                nameList.add(input);
            } else {
                quit = true;
            }
        }

        // Randomly select a winner.
        System.out.println(nameList.size());
        int winnerIndex = (int) (Math.random() * nameList.size() + 1);

        System.out.println("The winner is... " + nameList.get(winnerIndex));
        nameList.remove(nameList.get(winnerIndex)); // Removes winner to give others a better chance
    }
}
