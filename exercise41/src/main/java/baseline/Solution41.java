/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;
import java.io.FileNotFoundException;

public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {
        NameSorter ns = new NameSorter();
        ns.readNames();
        try {
            ns.outputNames();
        }
        catch (Exception e) {
            System.out.println("\nOutput file not found.\n");
        }
    }
}
