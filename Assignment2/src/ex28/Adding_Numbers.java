/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex28;

import java.util.Scanner;

public class Adding_Numbers {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int element;
        while(count <6){
            System.out.print("Enter the value: ");
            element =sc.nextInt();
            System.out.println(element);
            sum +=element;
            count++;
        }
        System.out.println("The total is " + sum);
    }
}

