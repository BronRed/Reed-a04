/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Employees {
    public void printEmployeeData() {
        try {
            Scanner file = new Scanner(new File("data/exercise42_input.txt"));
            //print tab header "Last First Salary\n-------------------"
            System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
            System.out.println("--------------------------");
            //while input file has next line, get data for employee
            while (file.hasNextLine()) {
                String s = file.nextLine();
                String[] temp = s.split(",");
                //print out employee data in tabular format
                System.out.printf("%-10s%-10s%-10s\n", temp[0], temp[1], temp[2]);
            }
            file.close();
        } catch (FileNotFoundException ex) {
            System.out.println("\nInput file not found.\n");
        }
    }
}
