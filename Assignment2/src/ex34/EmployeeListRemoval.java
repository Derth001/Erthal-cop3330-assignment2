/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Erthal
 */

package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class EmployeeListRemoval {
    // Objects
    public static Scanner scan = new Scanner(System.in);
    public static List<String> originalList = new ArrayList<String>();
    public static List<String> newList = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        // Read from file
        File myFile = new File("src\\ex34\\employee.txt");
        BufferedReader br = new BufferedReader(new FileReader(myFile));
        String employeeName;

        // Populate list with current employees.
        while ((employeeName = br.readLine()) != null) {
            originalList.add(employeeName);
        }

        // Print current list of employees
        for (int i = 0; i < originalList.size(); i++) {
            System.out.println(originalList.get(i));
        }

        // Remove specified employee
        System.out.print("\nEnter an employee name to remove: ");
        String removePerson = scan.nextLine();
        System.out.println();

        for (int i = 0; i < originalList.size(); i++) {
            if (originalList.get(i).equals(removePerson)) {
                continue;
            } else {
                newList.add(originalList.get(i));
            }
        }

        // Print new list
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}