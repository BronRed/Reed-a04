/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;

import java.io.IOException;

public class Solution45 {
    public static void main(String[] args) throws IOException {
        ModifyText mt = new ModifyText();
        //path to files
        mt.path = "data/";
        //Create output file
        mt.createFile();
        //read in input file and replace "utilize" with "use"
        //copy new text to output file
        mt.readAndReplace();
    }
}
