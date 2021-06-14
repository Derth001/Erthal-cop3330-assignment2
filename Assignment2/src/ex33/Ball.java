/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {

        String arr[] = { "Yes", "No", "Maybe", "Ask again later"};
        Random r = new Random();
        Scanner sx = new Scanner(System.in);
            System.out.println("What is your question?");
            String a = sx.next();
            int index = r.nextInt(4);
            System.out.println(arr[index]);

    }
}
