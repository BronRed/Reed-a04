/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSorter {
    //store names in arraylist
    ArrayList<String> names = new ArrayList<>();

    //read names and sort alphabetically
    //throw exception if input file not found
    public void readNames() throws FileNotFoundException {
        //read data in input.txt until no more lines
        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));
        //while there's more lines in input file, keep reading
        while (inputFile.hasNextLine()) {
            names.add(inputFile.nextLine());
        }
        //sort the names alphabetically
        names.sort(String.CASE_INSENSITIVE_ORDER);
        //close file
        inputFile.close();
    }

    //output names using fileWriter
    //make exception if file wasn't found or created
    public void outputNames() throws IOException {
        FileWriter output = new FileWriter("exercise41_output.txt");
        //write number of names
        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");
        //write out names
        for (String i : names) {
            output.write(i + "\n");
        }
        //close file
        output.close();
    }
}
