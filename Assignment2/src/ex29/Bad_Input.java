/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex29;

import java.util.Scanner;
import java.lang.*;

public class Bad_Input {
        public static void main (String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int value;
            while(true){
                System.out.print("What is the rate of return? ");
                value = sc.nextInt();
                System.out.println(value);
                if(value>=1 && value<=72){
                    System.out.println("it will take "+(72/value)+" year to double your initial investment");
                    break;
                }
                else
                {
                    System.out.println("Sorry this is not a valid input");
                }
            }
        }
    }

