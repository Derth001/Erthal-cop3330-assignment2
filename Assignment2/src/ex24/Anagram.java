/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams");

        System.out.printf("Enter the first string:");
        Scanner input = new Scanner (System.in);
        String a = input.next();

        System.out.printf("Enter the second string:");
        input = new Scanner (System.in);
        String b = input.next();

        if(isAnagram(a,b)){
            System.out.println(a + " and " + b + " are anagrams");
        }
        else{
            System.out.println(a + " and " + b + " are not anagrams");
        }
    }
    public static boolean isAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        s1 = s1.replace(" ","");
        s2 = s2.replace(" ","");
        s1 = s1.replace("-","");
        s2 = s2.replace("-","");
        char[] chrArray1 = s1.toCharArray();
        char[] chrArray2 = s2.toCharArray();
        if(chrArray1. length != chrArray2. length){
            return false;
        }
        Arrays.sort(chrArray1);
        Arrays.sort(chrArray2);
        for(int index = 0; index<chrArray1. length; index++){
            if(chrArray1[index] != chrArray2[index]){
                return false;
            }
        }
        return true;
    }
}
