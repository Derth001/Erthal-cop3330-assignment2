/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex30;

public class Multiplication {
    public static void main(String[] args) {

        System.out.format("      ");

        for(int i = 1; i<=12;i++ ) {

            System.out.format("%4d",i);

        }

        System.out.println();

        System.out.println("-------------------------------------------------------");

        for(int i = 1 ;i<=12;i++) {

            System.out.format("%4d |",i);

            for(int j=1;j<=12;j++) {

                System.out.format("%4d",i*j);

            }

            System.out.println();

        }

    }

}
