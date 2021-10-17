/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;

import java.io.FileNotFoundException;

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        WordCounter wc = new WordCounter();
        wc.readFile();
        wc.printMap();
    }
}
