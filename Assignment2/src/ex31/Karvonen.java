/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex31;

import java.util.Scanner;

public class Karvonen {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.print("Enter your resting heart rate: ");
        int restingPulse=sc.nextInt();
        System.out.println("Resting Pulse : "+restingPulse+" Age: "+age);
        for(int i=55;i<=95;i+=5)
        {
            int heartRate=(int)Math.round((((220-age)-restingPulse)*(i/100.0))+restingPulse);
            System.out.println(i+"%\t "+heartRate+"bpm");
        }
    }

}
