/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputeStats {

    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Integer> numberList = new ArrayList<Integer>();
    public static ArrayList<Double> sdList = new ArrayList<Double>();


    public static void main(String[] args) {
        boolean quit = false;
        String input;

        while (!quit){
            System.out.println("Enter a number: ");
            input = scan.nextLine();

            if (input.equals("done")){
                quit = true;
            } else if (input.matches("^\\d+(\\.\\d+)?")) {
                int num = Integer.parseInt(input);
                numberList.add(num);
            } else {
                System.out.println("Invalid entry.");
            }
        }

        System.out.print("Numbers: ");
        for (int i = 0; i < numberList.size(); i++){
            System.out.print(numberList.get(i) + " ");
        }

        // Call functions
        System.out.println();
        System.out.println("The average is " + calcAverage());
        System.out.println("The minimum is " + calcMinimum());
        System.out.println("The maximum is " + calcMaximum());
        System.out.printf("The standard deviation is %.2f", calcStandardDev());
    }

    // Functions
    public static double calcAverage(){
        double mean = 0;

        for (int i = 0; i < numberList.size(); i++){
            mean += numberList.get(i);
        }
        mean /= numberList.size();

        return mean;
    }

    public static int calcMinimum(){
        int minimum = numberList.get(0);

        for (int i = 0; i < numberList.size(); i++){
            if (numberList.get(i) < minimum){
                minimum = numberList.get(i);
            }
        }

        return minimum;
    }

    public static int calcMaximum(){
        int maximum = numberList.get(0);

        for (int i = 0; i < numberList.size(); i++){
            if (numberList.get(i) > maximum){
                maximum = numberList.get(i);
            }
        }

        return maximum;
    }

    public static double calcStandardDev(){
        double sd; // Standard deviation
        double sdMean = 0.0;
        double newNum;
        double average = calcAverage();

        for (int i = 0; i < numberList.size(); i++){
            newNum = Math.pow((average - numberList.get(i)), 2);
            sdList.add(newNum);
        }

        for (int i = 0; i < sdList.size(); i++){
            sdMean += sdList.get(i);
        }
        sdMean /= sdList.size();
        sd = Math.pow(sdMean, 0.5);

        return sd;
    }
}
